package llama3.task29;

public class Task29_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}