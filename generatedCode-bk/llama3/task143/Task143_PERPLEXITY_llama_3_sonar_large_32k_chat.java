package llama3.task143;

import java.util.Arrays;

public class Task143_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}