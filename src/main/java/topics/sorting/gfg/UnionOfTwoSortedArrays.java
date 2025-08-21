package topics.sorting.gfg;

import java.util.ArrayList;

/**
 * https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
 * <p>
 * Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
 * Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
 *
 * Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
 * Output: [1, 2, 3, 4, 5, 6, 7]
 * Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
 * Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
 * Output: [1, 2, 3, 4, 5]
 * Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
 * Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
 * Output: [1, 2]
 * Explanation: Distinct elements including both the arrays are: 1 2.
 * Constraints:
 * 1  ≤  a.size(), b.size()  ≤  105
 * -109 ≤ a[i], b[i] ≤109
 */

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
       /* int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 6, 7};*/
        int a[] = {2, 2, 3, 4, 5};
        int b[] = {1, 1, 2, 3, 4};
        System.out.println("Output = " + union(a, b));
    }

    public static ArrayList<Integer> union(int a[], int b[]) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (list.isEmpty()) {
                    list.add(a[i]);
                } else if (list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (list.isEmpty()) {
                    list.add(a[j]);
                } else if (list.get(list.size() - 1) != a[i]) {
                    list.add(a[j]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (list.isEmpty()) {
                    list.add(b[j]);
                } else if (list.get(list.size() - 1) != b[j]) {
                    list.add(b[j]);
                }
                j++;
            }
        }
        while (i < a.length) {
            if (list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }
        while (j < b.length) {
            if (list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}
