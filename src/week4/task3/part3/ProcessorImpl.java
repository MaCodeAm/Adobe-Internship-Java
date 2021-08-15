package week4.task3.part3;

public class ProcessorImpl implements Processor {
    @Override
    public String calculateBinary(long decimal) {
        return null;
    }

    protected final static String binaryRepresentation(long decimal) {
        StringBuilder sb = new StringBuilder();
        while (decimal != 0) {
            sb.append(decimal % 2);
            decimal /= 2;
        }
        return sb.reverse().toString();
    }

    protected void timeNeeded(int millis) {
        long start = System.currentTimeMillis();
        long currentTime = start;
        while (start + millis > currentTime) {
            currentTime = System.currentTimeMillis();
        }
    }


}
