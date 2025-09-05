package topics.strings.leetcode;


public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println("compress(chars) = " + compress(chars));
    }

    public static int compress(char[] chars) {
        if (chars.length == 1) return 1;
        else {
            StringBuilder sb = new StringBuilder();
            int i = 0, j = 0;
            int frequency = 0;
            while (j < chars.length) {
                if (chars[i] == chars[j]) {
                    j++;
                } else {
                    frequency = j - i;
                    sb.append(chars[i] + String.valueOf(frequency));
                    i = j;
                }
            }
            frequency = j - i;
            char[] arr = sb.append(chars[i] + String.valueOf(frequency)).toString().toCharArray();
            return arr.length;
        }
    }
}
