class Solution {

    public String shortestBeautifulSubstring(String s, int k) {

        int length = 0;
        int i = 0;
        int j = 0;
        int l = 0;
        int m = 0;
        int minl = Integer.MAX_VALUE;

        while (i < s.length()) {

            length += s.charAt(i) - '0';

            if (length == k) {

                int currLen = i - j + 1;
                String curr = s.substring(j, i + 1);
                String ans = s.substring(l, m);

                if (minl > currLen ||
                    (minl == currLen && curr.compareTo(ans) < 0)) {

                    minl = currLen;
                    l = j;
                    m = i + 1;
                }
            }

            while (j <= i && length >= k - 1) {

                if (length == k - 1 && s.charAt(j) == '1')
                    break;

                length -= s.charAt(j) - '0';
                j++;
            }

            i++;
        }

        return s.substring(l, m);
    }
}