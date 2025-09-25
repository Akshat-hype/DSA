// Last updated: 9/25/2025, 12:24:39 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1;
        int st = 0;
        int end = 0;
        int result = 0;
        while (end<nums.length){
            product*=nums[end];
            while(product>=k&&st<=end){
                product/=nums[st];
                st++;
            }
            result=result+(end-st+1);
            end++;
        }
        return result;
    }
}