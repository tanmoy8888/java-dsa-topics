package topics.strings;

public class AllSubStrings {
    public static void main(String[] args) {
        String s = "abc";
        for (int i = 0; i < s.length(); i++) {
            String combination = "";
            for (int j = i; j < s.length(); j++) {
                combination += s.charAt(j);
                System.out.println(combination);
            }
        }
    }
}
