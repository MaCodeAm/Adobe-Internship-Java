package week6.SharedList;

public class Main {
    public static void main(String[] args) throws Exception {
        SharedList sharedList = new SharedList();

        for (int i = 0; i < 100; i++) {
            new Thread(sharedList).start();
        }

        Thread.sleep(2000);
        System.out.println(sharedList.getSize());
    }
}
