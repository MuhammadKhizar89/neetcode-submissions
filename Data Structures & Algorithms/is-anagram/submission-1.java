class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character,Integer> hs1 = new HashMap<>();
        HashMap<Character,Integer> hs2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) hs1.put(s.charAt(i), (hs1.containsKey(s.charAt(i)) ? hs1.get(s.charAt(i)) + 1 : 1));
        for (int i = 0; i < t.length(); i++) hs2.put(t.charAt(i), (hs2.containsKey(t.charAt(i)) ? hs2.get(t.charAt(i)) + 1 : 1));
        
        return hs1.equals(hs2);
    }
}
