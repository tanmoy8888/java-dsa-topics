package topics.basics.conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       /* if(number < 0) System.out.println(number);
        else System.out.println(-number);*/
        if(number < 0) number = -number;
        System.out.println(number);
    }
}
