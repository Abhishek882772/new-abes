class Solution {
    public boolean checkValidString(String s) {
        int lo = 0, hi = 0;  // min and max possible unmatched '('
        for (char c : s.toCharArray()) {
            if (c == '(') { lo++; hi++; }
            else if (c == ')') { lo--; hi--; }
            else { lo--; hi++; }   // '*' can be ')', '(' or empty
            if (hi < 0) return false;   // too many ')' even in best case
            lo = Math.max(lo, 0);       // can't have negative opens
        }
        return lo == 0;
    }
}