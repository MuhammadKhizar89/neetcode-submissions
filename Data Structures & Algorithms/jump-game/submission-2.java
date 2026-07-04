class Solution {
    public boolean generateDp(int[] nums, int val1, Boolean[] dp) {
        int n = nums.length;

        if (val1 >= n - 1) {
            return true;
        }
        if (nums[val1] == 0)
            return false;
        if (dp[val1] != null)
            return dp[val1];
        for (int i = 1; i <= nums[val1]; i++) {
            if (generateDp(nums, val1 + i, dp) == true) {
                return dp[val1] = true;
            }
        }
        return false;
    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean[] dp = new Boolean[n];
        return generateDp(nums, 0, dp);
    }
}
