package week4.task4;

public class lookAndSay {


    public static String createTheNextOne(String digit) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char tempValue = '/';

        for (int i = 0; i < digit.length(); i++) {
            if (tempValue != digit.charAt(i)) {
                if (count != 0) {
                    sb.append(count);
                    sb.append(tempValue);
                    count = 0;
                }
                tempValue = digit.charAt(i);

            }
            count++;
            if (i == digit.length() - 1) {
                sb.append(count);
                sb.append(digit.charAt(i));

            }
        }

        return sb.toString();
    }

    public static String lookAndSay(int n) {
        String result = "1";

        for (int i = 0; i < n; i++) {
            System.out.println(result);

            result = createTheNextOne(result);
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(lookAndSay(7));
    }

}
