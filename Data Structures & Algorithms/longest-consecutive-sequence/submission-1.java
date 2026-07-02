class Solution {
    public int longestConsecutive(int[] nums) {
        // HashSet<Integer> hs = new HashSet<>();
        Set<Integer> hs = new TreeSet<>();

        for (int num : nums) {
            hs.add(num);
        }
        int max = 0;
        int prev = 0;
        int count = 0;
        System.out.println(hs);
        for (int num : hs) {
            if (num - 1 != prev) {
                count = 0;
            }
            count++;
            max = Math.max(count, max);
            prev = num;
        }
        return max;
    }
}
