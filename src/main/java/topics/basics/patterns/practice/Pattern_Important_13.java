package topics.basics.patterns.practice;

public class Pattern_Important_13 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
