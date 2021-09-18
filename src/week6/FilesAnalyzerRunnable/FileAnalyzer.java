package week6.FilesAnalyzerRunnable;

import week6.FileGeneratorRunnable.FileGenerator;

import java.io.*;
import java.util.Random;

public class FileAnalyzer extends FileGenerator {
    String[] str = {"random 1", "random 2", "random 3", "random 4"};


    @Override
    public void run() {
        super.run();
        init();
        contains();
    }

    private void init() {
        File file;
        PrintWriter writer;
        Random random = new Random();
        String path;
        for (int i = 0; i < getStrList().size(); i++) {
            path = getStrList().get(i);
            file = new File(path);
            try {
                writer = new PrintWriter(file);

            } catch (FileNotFoundException e) {
                throw new RuntimeException("File not found", e);
            }
            writer.write(str[random.nextInt(4)]);
            writer.close();
        }

    }

    private void contains() {
        BufferedReader bufferedReader;
        String strTemp;
        for (int i = 0; i < getStrList().size(); i++) {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(getStrList().get(i))));
                strTemp = bufferedReader.readLine();
            } catch (Exception e) {
                throw new RuntimeException("File not found", e);
            }
            while (strTemp != null) {
                if (strTemp.contains(str[0])) {
                    System.out.println(getStrList().get(i) + " contains " + str[0]);
                }
                if (strTemp.contains(str[1])) {
                    System.out.println(getStrList().get(i) + " contains " + str[1]);
                }
                if (strTemp.contains(str[2])) {
                    System.out.println(getStrList().get(i) + " contains " + str[2]);
                }
                if (strTemp.contains(str[3])) {
                    System.out.println(getStrList().get(i) + " contains " + str[3]);
                }
                try {
                    strTemp = bufferedReader.readLine();
                } catch (IOException exc) {
                    throw new RuntimeException("IO Exception", exc);
                }


            }
        }

    }
}
