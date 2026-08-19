class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        // Store reserved seats for each row
        Map<Integer, Integer> reserved = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            // Only seats 2 to 9 matter
            if (col >= 2 && col <= 9) {
                reserved.put(row, reserved.getOrDefault(row, 0) | (1 << col));
            }
        }

        // Every completely empty row can hold 2 families
        int answer = (n - reserved.size()) * 2;

        for (int mask : reserved.values()) {
            boolean left = true;   // seats 2-5
            boolean middle = true; // seats 4-7
            boolean right = true;  // seats 6-9

            // Check seats 2,3,4,5
            for (int seat = 2; seat <= 5; seat++) {
                if ((mask & (1 << seat)) != 0) {
                    left = false;
                    break;
                }
            }

            // Check seats 4,5,6,7
            for (int seat = 4; seat <= 7; seat++) {
                if ((mask & (1 << seat)) != 0) {
                    middle = false;
                    break;
                }
            }

            // Check seats 6,7,8,9
            for (int seat = 6; seat <= 9; seat++) {
                if ((mask & (1 << seat)) != 0) {
                    right = false;
                    break;
                }
            }

            if (left && right) {
                answer += 2;
            } else if (left || middle || right) {
                answer += 1;
            }
        }

        return answer;
    }
}