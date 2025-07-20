package topics.basics.loops;

/**
 * Question :
 * - Print this [using a single loop]
 * a A
 * b B
 * +
 * c C
 * ...
 * ...
 */

public class PrintSmallAndCapitalAlphabets {
    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            char small = (char) (i + 97);
            char capital = (char) (i + 65);
            System.out.println(small + " " + capital);
        }
    }
}
