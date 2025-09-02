package topics.strings.gfg;

/**
  GFG : Sum of all substrings of a number

 https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1

 

 */

public class SumOfAllSubStringOfANumber {
    public static void main(String[] args) {
        String s = "6759";
        System.out.println("sumSubstrings(s) = " + sumSubstrings(s));
    }

    public static int sumSubstrings(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            String combination = "";
            for (int j = i; j < s.length(); j++) {
                combination += s.charAt(j);
                sum += Integer.parseInt(combination);
            }
        }
        return sum;
    }
}
