// Last updated: 9/25/2025, 12:25:16 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=n/2;
        int m=nums[mid];
        return m;
        
    }
}