// Last updated: 9/25/2025, 12:24:11 PM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0;
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                sum=Math.max(temp,sum);
                temp=0;
            }
            temp+=nums[i];
        }
        return Math.max(sum,temp);
    }
}