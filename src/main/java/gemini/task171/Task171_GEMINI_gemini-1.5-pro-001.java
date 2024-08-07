package gemini.task171;

class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > 2 * nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}