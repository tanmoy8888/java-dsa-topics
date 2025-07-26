package topics.basics.patterns;

public class NumberPattern_3 {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        for (int i = 1; i <= row; i++) {
            for (int j = 65; j < 69; j++) {
                System.out.print(" "+(char)j);
            }
            System.out.println();
        }
    }
}
