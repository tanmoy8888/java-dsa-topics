package topics.basics.conditionals;

import java.util.Scanner;

public class NumerHasFourDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 999 && number <= 9999) {
            System.out.println("Number has four digit.");
        } else {
            System.out.println("Number does has four digit.");
        }
    }
}
