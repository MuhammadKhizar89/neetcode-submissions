class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int preFix[] = new int[n];
        int postFix[] = new int[n];
        preFix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            preFix[i] = preFix[i - 1] * nums[i];
        }
        postFix[n-1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            postFix[i] = postFix[i + 1] * nums[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(preFix[i] + ",");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(postFix[i] + ",");
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                arr[i] = postFix[i + 1];
            else if (i == n - 1)
                arr[i] = preFix[i - 1];
            else
                arr[i] = preFix[i - 1] * postFix[i + 1];
        }
        return arr;
    }
}
