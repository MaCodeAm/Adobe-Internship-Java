package week6.FilesConcurrentProcessing;

public class Main {
    public static void main(String[] args) {
        FilesConcurrentProcessing filesConcurrentProcessing = new FilesConcurrentProcessing();
        new Thread(filesConcurrentProcessing).start();
        filesConcurrentProcessing.start();
    }
}
