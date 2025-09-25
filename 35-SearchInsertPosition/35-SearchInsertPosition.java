// Last updated: 9/25/2025, 12:25:50 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<target)
            k++;
        }
        return k;
    }
}