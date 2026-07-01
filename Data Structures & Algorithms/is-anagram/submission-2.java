class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> hs1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
            hs1.put(s.charAt(i), (hs1.containsKey(s.charAt(i)) ? hs1.get(s.charAt(i)) + 1 : 1));

        for (int i = 0; i < t.length(); i++) {
            if (hs1.containsKey(t.charAt(i))) {
                int found = hs1.get(t.charAt(i));
                hs1.put(t.charAt(i), found - 1);
                if (found-1 <= 0) {
                    hs1.remove(t.charAt(i));
                }
            }
        }

        return hs1.isEmpty();
    }
}
