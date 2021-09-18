package week6.FilesConcurrentProcessingJoin;

import week6.FileGeneratorRunnable.FileGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilesConcurrentProcessingJoin extends FileGenerator {
    private final static String AB = "ab";
    List<String> sharedList = new ArrayList<>();

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        start();
        System.out.println(sharedList);

    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                }
            });
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            containsAB(new File(getStrList().get(i)));
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
        sharedList.add(file.getAbsolutePath() + " contains " + count + " ab");
    }
}
