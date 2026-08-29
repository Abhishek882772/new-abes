class Solution {

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {

        int n = nums.length;

        // Store indices
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices according to their values in nums
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        int[] ans = nums.clone();

        // Process each group
        int start = 0;

        while (start < n) {

            int end = start;

            // Find the complete group
            while (end + 1 < n &&
                   nums[indices[end + 1]] - nums[indices[end]] <= limit) {
                end++;
            }

            // Get original indices of this group
            int size = end - start + 1;

            int[] groupIndices = new int[size];
            int[] groupValues = new int[size];

            for (int i = 0; i < size; i++) {
                groupIndices[i] = indices[start + i];
                groupValues[i] = nums[indices[start + i]];
            }

            // Sort original indices
            Arrays.sort(groupIndices);

            // groupValues are already sorted
            for (int i = 0; i < size; i++) {
                ans[groupIndices[i]] = groupValues[i];
            }

            start = end + 1;
        }

        return ans;
    }
}