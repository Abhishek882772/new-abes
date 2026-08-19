class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Arrays.sort(reservedSeats, (a, b) -> a[0] - b[0]);

        int ans = 0;
        int i = 0;

        while (i < reservedSeats.length) {

            int row = reservedSeats[i][0];

            boolean left = true;    // 2,3,4,5
            boolean middle = true;  // 4,5,6,7
            boolean right = true;   // 6,7,8,9

            // Process all reserved seats of this row
            while (i < reservedSeats.length &&
                   reservedSeats[i][0] == row) {

                int seat = reservedSeats[i][1];

                if (seat >= 2 && seat <= 5) {
                    left = false;
                }

                if (seat >= 4 && seat <= 7) {
                    middle = false;
                }

                if (seat >= 6 && seat <= 9) {
                    right = false;
                }

                i++;
            }

            // Both non-overlapping blocks are available
            if (left && right) {
                ans += 2;
            }
            // At least one block is available
            else if (left || middle || right) {
                ans += 1;
            }
        }

        // Rows having no reserved seats
        int reservedRows = 0;

        for (int j = 0; j < reservedSeats.length; ) {
            reservedRows++;

            int row = reservedSeats[j][0];

            while (j < reservedSeats.length &&
                   reservedSeats[j][0] == row) {
                j++;
            }
        }

        ans += (n - reservedRows) * 2;

        return ans;
    }
}