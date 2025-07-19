package topics.basics.conditionals;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) System.out.println(number + " is a even number");
        else System.out.println(number + " is a odd number");
    }
}
