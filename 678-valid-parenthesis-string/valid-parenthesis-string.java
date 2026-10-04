class Solution {
    private Boolean[][] memo;

    private boolean check(String s, int i, int open) {
        if (open < 0) return false;
        if (i == s.length()) return open == 0;
        if (memo[i][open] != null) return memo[i][open];

        char ch = s.charAt(i);
        boolean res;
        if (ch == '(') res = check(s, i + 1, open + 1);
        else if (ch == ')') res = check(s, i + 1, open - 1);
        else res = check(s, i + 1, open + 1)
                || check(s, i + 1, open - 1)
                || check(s, i + 1, open);

        return memo[i][open] = res;
    }

    public boolean checkValidString(String s) {
        memo = new Boolean[s.length() + 1][s.length() + 1];
        return check(s, 0, 0);
    }
}