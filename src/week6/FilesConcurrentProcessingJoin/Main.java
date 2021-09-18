package week6.FilesConcurrentProcessingJoin;

public class Main {
    public static void main(String[] args) {
        FilesConcurrentProcessingJoin filesConcurrentProcessingJoin = new FilesConcurrentProcessingJoin();
        new Thread(filesConcurrentProcessingJoin).start();
    }
}
