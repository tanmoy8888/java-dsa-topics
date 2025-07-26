package topics.basics.patterns.practice;

public class StarPlus_7 {
    public static void main(String[] args) {
        int n = 7;
        int middle = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == middle || j == middle) System.out.print("* ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
