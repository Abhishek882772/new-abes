class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int diff = 0;
        int q = 0;

        for (int i = 0; i < n; i++) {
            int sign = (i < n / 2) ? 1 : -1;

            if (num.charAt(i) == '?') {
                q += sign;
            } else {
                diff += sign * (num.charAt(i) - '0');
            }
        }

        if (q == 0) {
            return diff != 0;
        }

        // Alice wins if the current difference cannot be
        // neutralized by the remaining question marks.
        return diff * q >= 0 || Math.abs(diff) * 2 != 9 * Math.abs(q);
    }
}