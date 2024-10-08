package claude2.task144;

import java.util.ArrayList;
import java.util.List;

public class Task144_CLAUDE_claude_3_5_sonnet_20240620 {
    public static List<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged.add(arr1[i]);
                i++;
            } else {
                merged.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            merged.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            merged.add(arr2[j]);
            j++;
        }
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        List<Integer> result = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged sorted array: " + result);
    }
}
