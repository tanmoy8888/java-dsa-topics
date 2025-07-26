package topics.basics.patterns.practice;

import java.util.Scanner;

/**

 Print Floyd's triangle

 1
 2 3
 4 5 6



 */

public class FloydPattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
