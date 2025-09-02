package topics.strings.leetcode;

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
