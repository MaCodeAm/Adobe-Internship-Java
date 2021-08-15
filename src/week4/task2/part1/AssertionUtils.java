package week4.task2.part1;

public class AssertionUtils {

    public static void assertEquals(int val1, int val2) {
        if (val1 != val2) {
            throw new RuntimeException("The given values are not equal");
        }
    }

    public static void assertEquals(double val1, double val2) {
        if (val1 != val2) {
            throw new RuntimeException("The given values are not equal");
        }
    }

    public static void assertEquals(String val1, String val2) {
        if (val1 != val2) {
            throw new RuntimeException("The given values are not equal");
        }
    }

    public static void assertEquals(boolean val1, boolean val2) {
        if (val1 != val2) {
            throw new RuntimeException("The given values are not equal");

        }
    }

    public static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new RuntimeException("The given value is null");

        }
    }
}
