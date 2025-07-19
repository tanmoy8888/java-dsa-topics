package topics.type_casting;

public class TypeCasting {
    public static void main(String[] args) {
        // ASCII values of chars
        // A starts from 65
        // a starts from 97
        char c1 = 'A';
        char c2 = 'a';
        // Explicit type casting
        System.out.println("c1 = " + (int)c1);
        System.out.println("c2 = " + (int)c2);
        // Implicit type casting
        int a = c1;
        int b = c2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // chars + int gives int
        System.out.println(c1+0);
        // char + char = int
        System.out.println(c1+c2);

        /**
         *   very important below order has been followed in java
         *   char->int->float->double
         */
        // Very important below
        System.out.println(1+'1');
    }
}
