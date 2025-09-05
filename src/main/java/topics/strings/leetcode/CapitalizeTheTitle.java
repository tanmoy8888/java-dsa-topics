package topics.strings.leetcode;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        String titile = "capiTalIze tHe titLe";
        System.out.println("capitalizeTitle(titile) = " + capitalizeTitle(titile));
    }

    public static String capitalizeTitle(String title) {
        StringBuilder sbTitle = new StringBuilder();
        if (title.length() == 1 || title.length() == 2) return toLowerCase(title);
        else if (title.length() > 2) {
            String[] strArr = title.split(" ");
            for (String s : strArr) {
                char[] arr = s.toCharArray();
                StringBuilder word = new StringBuilder();
                for (int i = 0; i < arr.length; i++) {
                    if (i == 0) {
                        if (!((int) arr[i] >= 65 && (int) arr[i] <= 90)) {
                            word.append((char) (arr[i] - 32));
                        }
                    } else {
                        if ((int) arr[i] >= 65 && (int) arr[i] <= 90) {
                            word.append((char) (arr[i] + 32));
                        } else {
                            word.append(arr[i]);
                        }
                    }
                }
                if (!s.equals(strArr[strArr.length - 1])) {
                    sbTitle.append(word + " ");
                } else {
                    sbTitle.append(word);
                }
            }
        }
        return sbTitle.toString();
    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((int) arr[i] >= 65 && (int) arr[i] <= 90) {
                sb.append((char) (arr[i] + 32));
            } else {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
