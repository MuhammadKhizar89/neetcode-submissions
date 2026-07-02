class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<List<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        // System.out.println(mp);
        mp.forEach((key, value) -> { buckets.get(value).add(key); });
        int count = 0;
        int arr[] = new int[k];
        for (int i = n ; i >= 0; i--) {
            if (count == k)
                break;
            for (int bucket : buckets.get(i)) {
                if (count == k)
                    break;
                arr[count] = bucket;
                // System.out.println(bucket);
                count++;
            }
        }
        return arr;
    }
}
