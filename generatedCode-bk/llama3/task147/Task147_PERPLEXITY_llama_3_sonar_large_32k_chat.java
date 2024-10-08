package llama3.task147;

import java.util.Arrays;
import java.util.Scanner;

public class Task147_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array of integers (space separated): ");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        Arrays.sort(nums);
        System.out.println("The kth largest element is: " + nums[nums.length - k]);
    }
}