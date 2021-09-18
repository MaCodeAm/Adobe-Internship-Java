package week6.SafeAndUnsafeCar;

import java.util.ArrayList;
import java.util.List;

public class UnsafeCar implements Car {
   private List<String> list = new ArrayList<>(6);

    @Override
    public void add(String passengerName) {
        list.add(passengerName);
    }

    @Override
    public void PassengerNames() {
        System.out.println(list);
    }
}
