package week4.task3.part3;

public class Test {
    public static void main(String[] args) {
        ArmProcessor armProcessor = new ArmProcessor();
        X86IntelProcessor x86IntelProcessor = new X86IntelProcessor();
        X8664IntelProcessor x8664IntelProcessor = new X8664IntelProcessor();

        long case1 = 25;  // 11001
        long case2 = 884; // 1101110100
        long case3 = 721; //1011010001

        System.out.println(armProcessor.calculateBinary(case1));
        System.out.println(x86IntelProcessor.calculateBinary(case1));
        System.out.println(x8664IntelProcessor.calculateBinary(case1));
        System.out.println(armProcessor.calculateBinary(case2));
        System.out.println(x86IntelProcessor.calculateBinary(case2));
        System.out.println(x8664IntelProcessor.calculateBinary(case2));
        System.out.println(armProcessor.calculateBinary(case3));
        System.out.println(x86IntelProcessor.calculateBinary(case3));
        System.out.println(x8664IntelProcessor.calculateBinary(case3));

    }


}

