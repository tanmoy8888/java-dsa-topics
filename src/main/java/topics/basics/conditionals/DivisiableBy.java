package topics.basics.conditionals;

import java.util.Scanner;

public class DivisiableBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 5 == 0 || number % 3 == 0) {
            System.out.println("Number is divisible.");
        } else {
            System.out.println("Number is not divisible.");
        }
    }
}
