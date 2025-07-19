package topics.basics.conditionals;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        System.out.println(a == b);
        System.out.println(a = b);
        // we cant type cast a boolean value in java
        System.out.println((int)a==b);
    }
}
