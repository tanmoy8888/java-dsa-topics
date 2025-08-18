package topics.sorting.gfg;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *  https://www.geeksforgeeks.org/problems/common-elements5420/1
 *  Given two integer arrays a[] and b[]. Return the list of elements common to both the lists
 *  and return the list in sorted order. Duplicates may be there in the output list.
 *
 *  Input: a[] = [3, 4, 2, 2, 4] , b[] = [3, 2, 2, 7]
 * Output: 2 2 3
 * Explanation: The common elements in sorted order are [2, 2, 3]
 *
 * Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2] , b[] = [9, 7, 3, 4, 9]
 * Output: 3 7 9
 * Explanation: The common elements in sorted order are [3, 7, 9]
 *
 *
 */

public class CommonElements {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int min = Math.min(a.length, b.length);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < min - 1; i++) {
            if (a[i] == b[i]) {
                list.add(a[i]);
            }
        }
        return list;
    }
}
