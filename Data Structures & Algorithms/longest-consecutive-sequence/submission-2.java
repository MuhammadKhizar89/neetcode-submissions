class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        int count=1;
        int max=0;
        for (int num : hs) {
            while(hs.contains(num-count)){
                count++;
            }
            max = Math.max(count, max);
            count=1;
        }
        return max;
    }
}
