package topics.strings.leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println("isAnagram(s,t) = " + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        else {
            char[] c1 = s.toCharArray();
            Arrays.sort(c1);
            char[] c2 = t.toCharArray();
            Arrays.sort(c2);
            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]) return false;
            }
            return true;
        }
    }
}
