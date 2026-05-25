// Last updated: 5/25/2026, 4:27:47 PM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) sb.append(c);
                depth++;
            } else {
                depth--;
                if (depth > 0) sb.append(c);
            }
        }

        return sb.toString();
    }
}
