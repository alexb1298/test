package com.fileoperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;


public class FileWordsOperations {
    private final Collection<File> files;
    private final Logger logger;

    public FileWordsOperations() {
        this.files = new ArrayList<>();
        this.logger = LoggerFactory.getLogger(this.getClass());
    }

    public void createCsvFileWithAllOccurrences() {
        final String resourcesPathname = "jt_09_string_operations\\src\\main\\resources";
        final File resourceFolder = new File(resourcesPathname);
        final String csvFileName = "jt_09_string_operations\\src\\main\\resources\\output\\occurrences.csv";
        final Collection<File> listOfTxtFiles = this.retrieveListWithAllTxtFiles(resourceFolder);
        final Map<String, Integer> occurrencesMap = this.retrieveMapWithAllOccurrences
                (listOfTxtFiles);

        try (final PrintWriter writer = new PrintWriter(csvFileName)) {
            final StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("key,value\n");
            for (final Map.Entry<String, Integer> entry : occurrencesMap.entrySet()) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(",");
                stringBuilder.append(entry.getValue());
                stringBuilder.append('\n');
            }
            writer.write(stringBuilder.toString());

        } catch (final FileNotFoundException exception) {
            this.logger.info(exception.getMessage(), exception);
        }
    }

    protected Collection<File> retrieveListWithAllTxtFiles(final File folder) {
        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                this.retrieveListWithAllTxtFiles(fileEntry);
            } else {
                final String regex = "(JT)-\\d\\d_[a-zA-Z]*\\d*_\\d(.txt)";
                final String fileEntryName = fileEntry.getName();
                if (fileEntryName.matches(regex)) {
                    this.files.add(fileEntry);
                }
            }
        }
        return this.files;
    }

    private Map<String, Integer> retrieveMapWithAllOccurrences(final Iterable<File> listOfFiles) {
        Scanner scanner;
        final Map<String, Integer> occurrencesMap = new HashMap<>();
        for (final File file : listOfFiles) {
            try {
                scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    final String line = scanner.nextLine();
                    final String regex = ", *|\\. *| |\\?|: *";
                    final String[] splits = line.split(regex);

                    for (final String split : splits) {
                        if (occurrencesMap.containsKey(split))
                            occurrencesMap.put(split, occurrencesMap.get(split) + 1);
                        else
                            occurrencesMap.put(split, 1);
                    }
                }
                scanner.close();
            } catch (final FileNotFoundException exception) {
                this.logger.info(exception.getMessage(), exception);
            }
        }
        return occurrencesMap;
    }

}
