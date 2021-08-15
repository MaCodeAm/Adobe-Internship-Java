package week4.task3.part2;

public class SlowClock implements Clock {
    private int seconds = 0;

    @Override
    public void start() {
        long start = System.currentTimeMillis();

        while (true) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - start >= 2000) {
                seconds++;
                start = currentTime;
                System.out.println(seconds);

            }
        }

    }
}
