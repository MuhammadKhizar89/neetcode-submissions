class Solution {
    private List<String> res = new ArrayList<>();
    private String[] digitToChar = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        backTrack("", digits, 0);
        return res;
        
    }
    public void backTrack(String combination, String digits, int index) {
        int n = digits.length();
        if (index == n) {
            res.add(combination);
            System.out.println(combination);
            return;
        }
        String word = digitToChar[(digits.charAt(index))-'0'];
        for (int i = 0; i < word.length(); i++) {
            backTrack(combination + word.charAt(i), digits, index + 1);
        }
    }
}
