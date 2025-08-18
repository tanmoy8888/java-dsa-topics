package topics.sorting.gfg;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * https://www.geeksforgeeks.org/problems/common-elements5420/1
 * Given two integer arrays a[] and b[]. Return the list of elements common to both the lists
 * and return the list in sorted order. Duplicates may be there in the output list.
 * <p>
 * Input: a[] = [3, 4, 2, 2, 4] , b[] = [3, 2, 2, 7]
 * Output: 2 2 3
 * Explanation: The common elements in sorted order are [2, 2, 3]
 * <p>
 * Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2] , b[] = [9, 7, 3, 4, 9]
 * Output: 3 7 9
 * Explanation: The common elements in sorted order are [3, 7, 9]
 */

public class CommonElements {
    public static void main(String[] args) {
        int a[] = {3, 4, 2, 2, 4};
        int b[] = {3, 2, 2, 7};
        System.out.println("Output = " + commonElements(a, b));
    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                list.add(a[i]);
                i++;
                j++;
            } else if (a[i] > b[j]) {
                j++;
            } else if (a[i] < b[j]) {
                i++;
            }
        }
        return list;
    }
}
