package topics.strings.gfg;

import java.util.Arrays;

/**
 GFG : Most Frequent Character
 https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1

 Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s.
 If more than one character occurs the maximum number of times then print the lexicographically smaller character.

 Examples:

 Input: s = "testsample"
 Output: 'e'
 Explanation: 'e' is the character which is having the highest frequency.
 Input: s = "output"
 Output: 't'
 Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
 Constraints:
 1 ≤ |s| ≤ 100

 
 */

public class MostFrequentCharacter {
    public static void main(String[] args) {
        //String s = "testsample";
        String s = "output";
        // [a, e, e, l, m, p, s, s, t, t]
        System.out.println("getMaxOccurringChar(s) = " + getMaxOccurringChar(s));
    }

    public static char getMaxOccurringChar(String s) {
        if (s.length() == 1) return s.charAt(0);
        else {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            int i = 0, j = 0;
            int maxFrequency = 0;
            char ans = s.charAt(0);
            while (j < arr.length) {
                if (arr[i] == arr[j]) {
                    j++;
                } else {
                    int freq = j - i;
                    if (maxFrequency < freq) {
                        maxFrequency = freq;
                        ans = arr[i];
                    }
                    i = j;
                }
            }
            int freq = j - i;
            if (maxFrequency < freq) {
                ans = arr[i];
            }
            return ans;
        }
    }
}
