package topics.basics.loops;

public class PrintEvenNumber {
    public static void main(String[] args) {
    /*    for (int i = 0; i <=100 ; i=i+2) {
            System.out.println("i = " + i);
        }*/
        // Another approach
        for (int i = 0; i <=100 ; i++) {
            if(i%2 ==0){
                System.out.println("i = " + i);
            }
        }
    }
}
