package topics.basics.loops;

public class CountDigit {
    public static void main(String[] args) {
        int number = 123456789;
        int digit = (number == 0) ? 1 : 0;

        while (number != 0) {
            number /= 10;
            digit++;
        }
        System.out.println("digit = " + digit);
    }
}
