package topics.strings;

/**
 Leetcode : 709. To Lower Case

 Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 Example 1:

 Input: s = "Hello"
 Output: "hello"
 Example 2:

 Input: s = "here"
 Output: "here"
 Example 3:

 Input: s = "LOVELY"
 Output: "lovely"


 Constraints:

 1 <= s.length <= 100
 s consists of printable ASCII characters.
 
 */

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Tanmoy";
        System.out.println("toLowerCase(s) = " + toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((int) arr[i] >= 65 && (int) arr[i] <= 90) {
                sb.append((char)(arr[i] + 32));
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
