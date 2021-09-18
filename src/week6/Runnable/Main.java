package week6.Runnable;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\maria\\Desktop\\tempFile.txt");
        RunnableImpl runnable = new RunnableImpl(file);
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
