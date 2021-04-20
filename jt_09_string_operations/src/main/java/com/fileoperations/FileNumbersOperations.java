package com.fileoperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.*;

public class FileNumbersOperations {
    private final Logger logger;
    private final FileWordsOperations wordsOperations;

    public FileNumbersOperations() {
        super();
        this.logger = LoggerFactory.getLogger(String.valueOf(this.getClass()));
        this.wordsOperations = new FileWordsOperations();
    }

    public void createTextFileWithNumbers() {
        final String resourcesPathname = "jt_09_string_operations\\src\\main\\resources";
        final File resourcesFolder = new File(resourcesPathname);

        final Collection<File> allTxtFiles = this.wordsOperations.retrieveListWithAllTxtFiles(resourcesFolder);
        final List<Number> numberList = this.createListOfNumbersFromFiles(allTxtFiles);

        final String fileName = "jt_09_string_operations\\src\\main\\resources\\output\\output.txt";
        try {

            final FileWriter fileWriter = new FileWriter(fileName, true);
            final PrintWriter writer = new PrintWriter(fileWriter);
            final StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n\n");
            for (final Number number : numberList) {
                stringBuilder.append(number);
                stringBuilder.append(" ---->");
                stringBuilder.append(number.getClass());
                stringBuilder.append("\n");
            }
            writer.write(stringBuilder.toString());
            writer.close();

        } catch (final IOException exception) {
            this.logger.error(exception.getMessage(), exception);
        }
    }

    private List<Number> createListOfNumbersFromFiles(final Iterable<File> files) {
        final int index = 0;
        final List<String> words = this.findAllWords(files);
        final List<Number> numbers = new ArrayList<>();
        for (final String word : words) {
            try {
                Number number = Double.parseDouble(word);
                numbers.add(index, number);
                number = Float.parseFloat(word);
                numbers.remove(index);
                numbers.add(index, number);
                number = Long.parseLong(word);
                numbers.remove(index);
                numbers.add(index, number);
                number = Integer.parseInt(word);
                numbers.remove(index);
                numbers.add(index, number);
                number = Short.parseShort(word);
                numbers.remove(index);
                numbers.add(index, number);

            } catch (final NumberFormatException exception) {
                //not necessary to log
            }
        }
        return numbers;
    }

    private List<String> findAllWords(final Iterable<File> files) {
        final List<String> words = new ArrayList<>();
        for (final File file : files) {
            try {
                final Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    final String word = scanner.next();
                    words.add(word);
                }
                scanner.close();
            } catch (final FileNotFoundException exception) {
                this.logger.error(exception.getMessage());
            }
        }
        return words;
    }
}
