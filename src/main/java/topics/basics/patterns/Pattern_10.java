package topics.basics.patterns;

import java.util.Scanner;

/**
 * 14. Print this below pattern
 *
 * 1 1 1 1 1
 * 1 2 2 2 2
 * 1 2 3 3 3
 * 1 2 3 4 4
 * 1 2 3 4 5
 */
public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j <=i) System.out.print(j+" ");
                else System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
