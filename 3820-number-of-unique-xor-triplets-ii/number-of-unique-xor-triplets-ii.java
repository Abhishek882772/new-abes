class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> pairs = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        int n = nums.length;

        // All possible XORs of two elements
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pairs.add(nums[i] ^ nums[j]);
            }
        }

        // Add third element
        for (int x : pairs) {
            for (int num : nums) {
                ans.add(x ^ num);
            }
        }

        return ans.size();
    }
}