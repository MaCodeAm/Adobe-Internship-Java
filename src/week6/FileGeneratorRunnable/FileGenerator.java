package week6.FileGeneratorRunnable;

import week6.Runnable.RunnableImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class FileGenerator implements Runnable {

    private final List<RunnableImpl> runnableList = new ArrayList<>();
    private final List<String> strList = new ArrayList<>();

    public FileGenerator() {
        createList();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            new Thread(runnableList.get(i)).start();
        }
    }

    public List<String> getStrList() {
        return strList;
    }

    private void createList() {
        String path = "C:\\Users\\maria\\Desktop\\Temp\\file";
        String ext = ".txt";
        Formatter formatter;
        String absPath;
        for (int i = 0; i < 10; i++) {
            absPath = path + i + ext;
            try {
                formatter = new Formatter(absPath);
            } catch (FileNotFoundException e) {
                throw new RuntimeException("File not found ", e);
            }
            runnableList.add(new RunnableImpl(new File(absPath)));
            strList.add(absPath);
            formatter.close();
        }

    }
}