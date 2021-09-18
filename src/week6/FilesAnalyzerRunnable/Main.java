package week6.FilesAnalyzerRunnable;

import week6.FilesAnalyzerRunnable.FileAnalyzer;

public class Main {

    public static void main(String[] args) {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        Thread thread = new Thread(fileAnalyzer);
        thread.start();
    }
}
