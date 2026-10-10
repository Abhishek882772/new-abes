
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2,
                                 int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        long k = (long) k1 + k2;

        long total = 0;
        for (int d : diff) {
            total += d;
        }

        // We can make every difference zero.
        if (k >= total) return 0;

        int low = 0, high = max;

        // Find the smallest maximum difference achievable.
        while (low < high) {
            int mid = low + (high - low) / 2;
            long required = 0;

            for (int d : diff) {
                if (d > mid) {
                    required += d - mid;
                }
            }

            if (required <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int limit = low;
        long remaining = k;
        long answer = 0;

        // Reduce every difference down to the chosen limit.
        for (int d : diff) {
            if (d > limit) {
                remaining -= d - limit;
                d = limit;
            }
            answer += (long) d * d;
        }

        // Use any remaining operations to reduce limit-level values.
        // Each such operation reduces one value from limit to limit - 1.
        long count = 0;
        for (int d : diff) {
            if (d >= limit && limit > 0) {
                count++;
            }
        }

        answer -= remaining * (2L * limit - 1);

        return answer;
    }
}
