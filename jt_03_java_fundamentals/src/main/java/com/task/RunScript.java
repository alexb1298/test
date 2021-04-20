package com.task;


import java.io.IOException;

public class RunScript {
    private RunScript() {
    }

    public static void main(final String[] args) throws IOException {
        final String path="jt_03_java_fundamentals\\src\\main\\java\\batchfiles\\task4.bat";
        final Runtime runtime=Runtime.getRuntime();
        runtime.exec("cmd /c start "+path);
    }
}
