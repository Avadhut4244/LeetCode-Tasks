class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;   // Count of unmatched '('
        int close = 0;  // Count of unmatched ')'

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;  // Found an unmatched opening parenthesis
            } else {
                if (open > 0) {
                    open--;  // Match with an unmatched '('
                } else {
                    close++; // Found an unmatched closing parenthesis
                }
            }
        }

        // The result is the sum of unmatched opening and closing parentheses
        return open + close;
    }
}
