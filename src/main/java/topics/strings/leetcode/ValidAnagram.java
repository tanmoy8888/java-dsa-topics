package topics.strings.leetcode;

import java.util.Arrays;

/**
 Leetcode : 242. Valid Anagram

 Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 Example 1:

 Input: s = "anagram", t = "nagaram"

 Output: true

 Example 2:

 Input: s = "rat", t = "car"

 Output: false



 Constraints:

 1 <= s.length, t.length <= 5 * 104
 s and t consist of lowercase English letters.
 
 */

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
