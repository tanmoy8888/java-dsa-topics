package topics.basics.inputs;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("i = " + i);
        double d = sc.nextDouble();
        System.out.println("d = " + d);
    }
}
