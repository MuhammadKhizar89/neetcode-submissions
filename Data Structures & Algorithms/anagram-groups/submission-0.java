class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<List<String>>();
        HashMap<Integer, HashMap<Character, Integer>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> hs1 = new HashMap<>();
            String word = strs[i];
            for (int j = 0; j < word.length(); j++) {
                hs1.put(word.charAt(j),
                    hs1.containsKey(word.charAt(j)) ? hs1.get(word.charAt(j)) + 1 : 1);
            }
            hm.put(i, hs1);
        }

        // System.out.println(hm);

        for (int i = 0; i < strs.length; i++) {
            if (!hm.containsKey(i)) continue;
            List<String> li = new ArrayList<>();

            li.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if (!hm.containsKey(j)) continue;
                if (hm.containsKey(i) && hm.containsKey(j) && hm.get(i).equals(hm.get(j))) {
                    li.add(strs[j]);
                    hm.remove(j);
                }
            }
            hm.remove(i);
            // System.out.println(hm);
            list.add(li);
        }

        return list;
    }
}
