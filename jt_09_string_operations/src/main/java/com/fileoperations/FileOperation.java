package com.fileoperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileOperation {
    private final FileWordsOperations wordsOperations;
    private final FileSentenceOperations sentenceOperations;
    private final FileNumbersOperations numbersOperations;
    public FileOperation() {
        final Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("Welcome to Chapter9.");
        this.wordsOperations=new FileWordsOperations();
        this.sentenceOperations=new FileSentenceOperations();
        this.numbersOperations=new FileNumbersOperations();
    }
    public void runAll()
    {
        this.wordsOperations.createCsvFileWithAllOccurrences();
        this.sentenceOperations.inverseAllSentences();
        this.numbersOperations.createTextFileWithNumbers();
    }


}
