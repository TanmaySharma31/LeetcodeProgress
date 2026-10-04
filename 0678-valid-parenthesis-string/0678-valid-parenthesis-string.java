class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                low++;
                high++;
            } 
            else if (c == ')') {
                low--;
                high--;
            } 
            else { // '*'
                low--;   // treat '*' as ')'
                high++;  // treat '*' as '('
            }

            // Even the maximum possible number of '(' is negative
            if (high < 0) {
                return false;
            }

            // We can always choose '*' as empty
            low = Math.max(low, 0);
        }

        return low == 0;
    }
}