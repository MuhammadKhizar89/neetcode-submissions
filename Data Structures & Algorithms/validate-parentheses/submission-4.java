class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty()
                && ((c == ')' && st.peek() != '(') || (c == '}' && st.peek() != '{')
                    || (c == ']' && st.peek() != '['))) {
                return false;
            }
            if (!st.isEmpty()&& ((c == ')' && st.peek() == '(') || (c == '}' && st.peek() == '{')
                || (c == ']' && st.peek() == '['))) {
                st.pop();
                continue;
            }
            // st.forEach(element -> System.out.print(element + ", "));
            // System.out.println();
            st.push(c);
        }
        return st.isEmpty();
    }
}
