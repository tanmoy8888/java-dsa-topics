package topics.basics.loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean composite = false;
        for (int i = 2; i < n-1; i++) {
            if(n%i ==0){
                composite =true;
                break;
            }
        }
        System.out.println("composite = " + composite);
    }
}
