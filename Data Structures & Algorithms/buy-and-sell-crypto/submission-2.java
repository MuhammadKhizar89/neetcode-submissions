class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==1) return 0;
        int l = 0;
        int r = 1;
        int max = 0;
        while (l <= r) {
            if (prices[l] > prices[r]) {
                l++;
            } else if (prices[r] > prices[l]) {
                max = Math.max(max, prices[r] - prices[l]);
            }
            if (r < n-1)
                r++;
            else
                l++;
        }
        return max;
    }
}
