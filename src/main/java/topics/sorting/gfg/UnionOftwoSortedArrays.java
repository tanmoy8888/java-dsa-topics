package topics.sorting.gfg;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
 * <p>
 * Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
 * Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
 */

public class UnionOftwoSortedArrays {
    public static void main(String[] args) {
       /* int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 6, 7};*/
        int a[] = {2, 2, 3, 4, 5};
        int b[] = {1, 1, 2, 3, 4};
        System.out.println("Output = " + commonElements(a, b));
    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                list.add(a[i]);
                i++;
                j++;
            } else if (a[i] > b[j]) {
                list.add(a[i]);
                j++;
            } else if (a[i] < b[j]) {
                list.add(a[i]);
                i++;
            }
        }
        return list;
    }
}
