// Last updated: 9/25/2025, 12:25:36 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = right - 1;
                } else {
                    left = left + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = left + 1;
                } else {
                    right = right - 1;
                }
            }
        }

        return false;
    }
}