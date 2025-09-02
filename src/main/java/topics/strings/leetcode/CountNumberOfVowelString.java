package topics.strings.leetcode;

/**
 Leetcode : 2586. Count the Number of Vowel Strings in Range

 You are given a 0-indexed array of string words and two integers left and right.

 A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

 Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].



 Example 1:

 Input: words = ["are","amy","u"], left = 0, right = 2
 Output: 2
 Explanation:
 - "are" is a vowel string because it starts with 'a' and ends with 'e'.
 - "amy" is not a vowel string because it does not end with a vowel.
 - "u" is a vowel string because it starts with 'u' and ends with 'u'.
 The number of vowel strings in the mentioned range is 2.
 Example 2:

 Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
 Output: 3
 Explanation:
 - "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
 - "mu" is not a vowel string because it does not start with a vowel.
 - "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
 - "artro" is a vowel string because it starts with 'a' and ends with 'o'.
 The number of vowel strings in the mentioned range is 3.


 Constraints:

 1 <= words.length <= 1000
 1 <= words[i].length <= 10
 words[i] consists of only lowercase English letters.
 0 <= left <= right < words.length

 */

public class CountNumberOfVowelString {
    public static void main(String[] args) {
        String[] words = {"hey", "aeo", "mu", "ooo", "artro"};
        int left = 1;
        int right = 4;
        System.out.println("vowelStrings(words,left,right) = " + vowelStrings(words, left, right));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (words[i].length() == 1) {
                if (checkVowel(words[i].charAt(0))) {
                    count++;
                }
            } else if (checkVowel(words[i].charAt(0)) && checkVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }

    private static boolean checkVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        else return false;
    }
}
