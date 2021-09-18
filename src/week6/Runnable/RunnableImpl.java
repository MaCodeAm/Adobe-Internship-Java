package week6.Runnable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.security.SecureRandom;

public class RunnableImpl implements Runnable {
    private final File file;
    private final SecureRandom secureRandom;
    private final String chars = "abcdefghijklmnopqrstuvwxyz";

    public RunnableImpl(File file) {
        this.file = file;
        this.secureRandom = new SecureRandom();
    }

    @Override
    public void run() {
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found ", e);
        }
        for (int i = 0; i < 10000; i++) {
                     printWriter.write(generateRandomString() + "\n");
        }
        printWriter.close();
    }

    private String generateRandomString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            sb.append(chars.charAt(secureRandom.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
