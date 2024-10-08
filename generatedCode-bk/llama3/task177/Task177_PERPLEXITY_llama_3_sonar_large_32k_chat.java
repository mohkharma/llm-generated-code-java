package llama3.task177;

public class Task177_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public int maxSum(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1], nums[i]);
            for (int j = 1; j <= Math.min(i, k); j++) {
                dp[i] = Math.max(dp[i], dp[i-j-1] + nums[i]);
            }
        }
        return dp[n-1];
    }
}