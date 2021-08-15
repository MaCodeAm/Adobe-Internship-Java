package week4.task3.part2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 or 2");
        int digit = scanner.nextInt();
        clockStarter(digit);
        scanner.close();

    }

    public static void clockStarter(int digit) {
        if (digit == 1) {
            FastClock fastClock = new FastClock();
            fastClock.start();
        } else if (digit == 2) {
            SlowClock slowClock = new SlowClock();
            slowClock.start();
        } else throw new RuntimeException("The provided argument is illegal");
    }
}
