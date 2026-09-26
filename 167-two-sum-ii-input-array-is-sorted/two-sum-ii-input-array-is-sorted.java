public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            } 
            
            if (currentSum < target) {
                // Micro-optimization: Instead of left++, binary search for the first element
                // that could actually sum up to target with numbers[right]
                int needed = target - numbers[right];
                left = binarySearchLeftBound(numbers, left + 1, right - 1, needed);
            } else {
                // Micro-optimization: Instead of right--, binary search for the first element
                // that could actually sum up to target with numbers[left]
                int needed = target - numbers[left];
                right = binarySearchRightBound(numbers, left + 1, right - 1, needed);
            }
        }

        return new int[]{-1, -1};
    }

    // Finds the first index containing a value >= needed
    private int binarySearchLeftBound(int[] nums, int low, int high, int needed) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= needed) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // Finds the last index containing a value <= needed
    private int binarySearchRightBound(int[] nums, int low, int high, int needed) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= needed) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}