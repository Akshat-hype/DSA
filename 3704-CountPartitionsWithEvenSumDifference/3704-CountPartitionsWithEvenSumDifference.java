// Last updated: 9/25/2025, 12:23:43 PM
class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }

        int leftSum=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            rightSum-=nums[i];
            int diff=leftSum - rightSum;
            if(diff%2==0){
                count++;
            }
        }
        return count;
    }
}