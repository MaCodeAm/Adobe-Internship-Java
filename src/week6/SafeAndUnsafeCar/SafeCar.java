package week6.SafeAndUnsafeCar;

import java.util.ArrayList;
import java.util.List;

public class SafeCar implements Car {

    private List<String> list = new ArrayList<>(6);

    @Override
    public synchronized void add(String passengerName) {
        list.add(passengerName);
    }

    @Override
    public synchronized void PassengerNames() {
        System.out.println(list);
    }
}
