package topics.strings.gfg;

import java.util.Arrays;

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
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
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
            return ans;
        }
    }
}
