class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int costSum = 0;
        int gasSum = 0;
        for (int i = 0; i < n; i++) {
            costSum += cost[i];
            gasSum += gas[i];
        }
        if (costSum > gasSum)
            return -1;

        int total = 0;
        int index=0;
        for (int i = 0; i < n; i++) {
            total+=(gas[i]-cost[i]);
            if (total < 0) {
                total = 0;
                index = i + 1;
            }
        }
        return index;
    }
}
