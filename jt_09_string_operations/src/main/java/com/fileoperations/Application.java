package com.fileoperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;



public class Application {
    private final Logger logger;
    public Application() {
        this.logger = LoggerFactory.getLogger(this.getClass());
        this.logger.info("Application Started.");
    }

    public static void main(final String[] args) {
        final Logger logger=LoggerFactory.getLogger(Application.class);
        final String path="jt_09_string_operations\\src\\main\\resources\\output\\output.txt";
        final java.io.File file =new File(path);
        final File parentFile = file.getParentFile();
        parentFile.mkdirs();
        try  {
            final PrintWriter writer = new PrintWriter(path);
            writer.close();
        } catch (final IOException exception) {
            logger.error(exception.getMessage(),exception);
        }

        final FileOperation fileOperation=new FileOperation();
        fileOperation.runAll();
    }

}
