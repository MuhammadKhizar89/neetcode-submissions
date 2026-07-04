class Solution {
    public boolean isSame(String s1, String s2, int i, int j) {
        char[] chars = s2.substring(i, j + 1).toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);
        return sorted1.equals(sorted);
    }
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        if (n > s2.length())
            return false;
        int i = 0;
        int j = n - 1;
        while (j < s2.length()) {
            // System.out.println(i + "-" + j);
            if (isSame(s1, s2, i, j)) {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}
