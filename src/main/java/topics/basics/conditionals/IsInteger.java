package topics.basics.conditionals;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int i = (int) d;
        if (d == i) {
            System.out.println("This is an integer");
        } else {
            System.out.println("This is not an integer");
        }
    }
}
