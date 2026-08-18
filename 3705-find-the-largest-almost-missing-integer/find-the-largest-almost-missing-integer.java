class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        // Every element belongs to exactly one subarray
        // when k == n.
        if (k == n) {
            int ans = -1;

            for (int x : nums) {
                ans = Math.max(ans, x);
            }

            return ans;
        }

        // For k == 1, each subarray contains exactly one element.
        // So an element is almost missing if it occurs exactly once.
        if (k == 1) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int x : nums) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            int ans = -1;

            for (int x : nums) {
                if (map.get(x) == 1) {
                    ans = Math.max(ans, x);
                }
            }

            return ans;
        }

        // For 1 < k < n, only the first and last
        // elements can belong to exactly one window.
        int ans = -1;

        if (count(nums, nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (count(nums, nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }

    private int count(int[] nums, int x) {
        int count = 0;

        for (int num : nums) {
            if (num == x) {
                count++;
            }
        }

        return count;
    }
}