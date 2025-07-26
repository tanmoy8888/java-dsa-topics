package topics.basics.patterns;

public class AlphabetPrinting_4 {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        int j =0;
        for (int i = 0; i < row; i++) {
            if(i%2 ==0){
               j=65+i;
            }
            else {
                j = 97+i;
            for (j = 1; j < col; j++) {
                System.out.print(" "+(char)j);
            }

            }
            System.out.println();
        }
    }
}
