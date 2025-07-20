package topics.basics.conditionals;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number.");
        int first = sc.nextInt();
        System.out.println("Enter second number.");
        int second = sc.nextInt();
        System.out.println("Enter third number.");
        int third = sc.nextInt();
        if (first > second && first > third) {
            System.out.println(first + " first is greatest");
        } else if (second > first && second > third) {
            System.out.println(second + " second is greatest");
        } else {
            System.out.println(third + " third is greatest");
        }
    }
}
