package week4.task3.part3;

public class ArmProcessor extends ProcessorImpl {

    @Override
    public String calculateBinary(long decimal) {
        timeNeeded(1000);
        return binaryRepresentation(decimal);
    }
}
