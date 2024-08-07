package llama3.task146;

import java.util.Scanner;

public class Task146_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array of unique integers: ");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        int n = nums.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("The missing number is: " + (total - sum));
    }
}