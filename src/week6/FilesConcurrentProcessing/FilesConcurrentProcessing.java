package week6.FilesConcurrentProcessing;

import week6.FileGeneratorRunnable.FileGenerator;

import java.io.*;

public class FilesConcurrentProcessing extends FileGenerator {
    private final static String AB = "ab";

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        start();

    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    File file = new File(getStrList().get(index));
                    containsAB(file);
                }
            }).start();
        }
    }

    private void containsAB(File file) {
        BufferedReader bufferedReader;
        String tempLine = "";
        int count = 0;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            tempLine = bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException("File not found", e);
        }
        while (tempLine != null) {
            if (tempLine.contains(AB)) {
                count++;
                tempLine = tempLine.replace(AB, "00");
            } else {
                try {
                    tempLine = bufferedReader.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException("FIle not found", ex);
                }
            }
        }
        System.out.println(file.getAbsolutePath() + " contains " + count + " ab");
    }
}
