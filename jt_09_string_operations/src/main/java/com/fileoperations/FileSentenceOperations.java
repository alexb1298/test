package com.fileoperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FileSentenceOperations {
    private final DateTimeFormatter formatter;
    private final Logger logger;
    private final FileWordsOperations wordsOperations;

    public FileSentenceOperations() {

        super();
        this.formatter = DateTimeFormatter.RFC_1123_DATE_TIME;
        this.logger = LoggerFactory.getLogger(String.valueOf(this.getClass()));
        this.wordsOperations = new FileWordsOperations();
    }

    public void inverseAllSentences() {
        final String resourcesPathname = "jt_09_string_operations\\src\\main\\resources";
        final File resourceFolder = new File(resourcesPathname);
        final Collection<File> files = this.wordsOperations.retrieveListWithAllTxtFiles
                (resourceFolder);
        this.createFilesWithInverseSentences(files);
    }

    private void createFilesWithInverseSentences(final Iterable<File> files) {
        StringBuilder stringBuilder;
        final String newPath = "jt_09_string_operations\\src\\main\\resources\\output\\output.txt";
        for (final File file : files) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("\n");
            stringBuilder.append(this.formatter.format(ZonedDateTime.now()));
            stringBuilder.append("\n");
            try {
                final FileWriter fileWriter = new FileWriter(newPath, true);
                final PrintWriter writer = new PrintWriter(fileWriter);
                final Iterable<String> sentences = this.parseSentencesFromFile(file);
                for (final String sentence : sentences) {
                    stringBuilder.append(sentence);
                }
                stringBuilder.append("\n");
                stringBuilder.append(LocalDateTime.now());
                stringBuilder.append("\n");
                writer.write(stringBuilder.toString());
                writer.close();
            } catch (final IOException exception) {
                this.logger.error(exception.getMessage(), exception);
            }

        }
    }

    private Collection<String> parseSentencesFromFile(final File file) throws FileNotFoundException {
        final Scanner scanner = new Scanner(file);
        final String pattern = "\\. *|: * |\\? *|! *|\\?! *";
        scanner.useDelimiter(pattern);
        final List<String> sentences = new ArrayList<>();
        while (scanner.hasNext()) {
            final String sentence = scanner.next();
            sentences.add(sentence);
        }
        scanner.close();
        Collections.reverse(sentences);
        return sentences;
    }


}
