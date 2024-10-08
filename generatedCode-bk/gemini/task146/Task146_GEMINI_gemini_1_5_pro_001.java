package gemini.task146;

import java.util.Arrays;

public class Task146_GEMINI_gemini_1_5_pro_001 {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; 
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
}