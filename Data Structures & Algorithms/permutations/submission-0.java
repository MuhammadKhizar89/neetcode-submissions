class Solution {
    List<List<Integer>> solutions;
    void generatePermute(List<Integer> left, List<Integer> right) {
        int n = right.size();
        if (n == 0) {
            solutions.add(left);
        }

        for (int i = 0; i < n; i++) {
            List<Integer> newLeft = new ArrayList<>();
            
            List<Integer> newRight = new ArrayList<>();
            for (int oldleft : left) {
                newLeft.add(oldleft);
            }
            newLeft.add(right.get(i));
             for (int oldright : right) {
                if(right.get(i)!=oldright)
                    newRight.add(oldright);
            }
            generatePermute(newLeft, newRight);
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        solutions = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i : nums) {
            right.add(i);
        }
        generatePermute(new ArrayList<>(), right);
        return solutions;
    }
}
