package week6.SharedList;

import java.util.ArrayList;
import java.util.List;

public class SharedList implements Runnable {
    private final List<Integer> sharedList = new ArrayList<>();

    @Override
    public synchronized void run() {
        for (int i = 0; i < 500; i++) {
            sharedList.add(i);
        }
    }

    public int getSize() {
        return this.sharedList.size();
    }

}
