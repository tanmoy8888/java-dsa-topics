package topics.basics.patterns;

public class StartPattern5 {
    public static void main(String[] args) {
        int n =7;
        int m =3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == m) System.out.print(" " +"*");
            }
            System.out.println();
        }
    }
}
