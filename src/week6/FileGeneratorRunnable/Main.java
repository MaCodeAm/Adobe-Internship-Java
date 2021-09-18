package week6.FileGeneratorRunnable;

public class Main {
    public static void main(String[] args) throws Exception {
        FileGenerator fileGenerator = new FileGenerator();
        Thread thread = new Thread(fileGenerator);
        thread.start();
    }
}
