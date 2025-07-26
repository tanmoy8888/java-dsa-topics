package topics.basics.patterns.practice;

import java.util.Scanner;

/**

 Print this below pattern

 1
 1 3
 1 3 5
 1 3 5 7

 */

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        /*for (int i = 1; i <=n ; i++) {
            int a = 1;
            for (int j = 1; j <=i;j++) {
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }*/

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i;j++) {
                if(j > 1) System.out.print((2*j-1)+" ");
                else System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
