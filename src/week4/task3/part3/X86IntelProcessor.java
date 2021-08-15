package week4.task3.part3;

public class X86IntelProcessor  extends ProcessorImpl {

    @Override
    public String calculateBinary(long decimal) {
        timeNeeded(4000);
        return binaryRepresentation(decimal);
    }
}