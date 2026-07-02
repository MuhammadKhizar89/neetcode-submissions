class Solution {
    public String encode(List<String> strs) {
        String ans = "";
        for (String str : strs) {
            if (str == "")
                ans += str + ";";
            ans += str + "😂";
            // System.out.println(str);
        }
        return ans;
    }

    public List<String> decode(String str) {
        System.out.println(str);
        if (str.isEmpty()) { return new ArrayList<>(); }
        List<String> list = new ArrayList<>();
        String[] arr = str.split("\\😂");

        for (String s : arr) {
            if (s.equals(";"))
                list.add("");
            else list.add(s);
        }
        return list;
    }
}
