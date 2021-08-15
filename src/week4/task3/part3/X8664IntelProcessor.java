package week4.task3.part3;

public class X8664IntelProcessor extends ProcessorImpl {

    @Override
    public String calculateBinary(long decimal) {
        timeNeeded(2000);
        return binaryRepresentation(decimal);
    }
}