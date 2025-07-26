package topics.basics.patterns.practice;

import java.util.Scanner;

/**
 * Print this below pattern.

 O/P =>

 1
 A B
 3 3 3
 A B C D
 5 5 5 5 5  

 */

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2 ==0) System.out.print((char) (64+j)+" ");
                else System.out.print(+i+" ");
            }
            System.out.println();
        }
    }
}
