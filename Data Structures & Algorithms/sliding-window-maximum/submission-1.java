class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = k - 1;
        int[] max = new int[n - k + 1];
        int count = Integer.MIN_VALUE;
        while (j < n) {
            System.out.println(i + "-" + j);
            for (int l = i; l <= j; l++) {
                count = Math.max(count, nums[l]);
            }
            max[i] = count;
            count = Integer.MIN_VALUE;
            i++;
            j++;
        }
        return max;
    }
}
