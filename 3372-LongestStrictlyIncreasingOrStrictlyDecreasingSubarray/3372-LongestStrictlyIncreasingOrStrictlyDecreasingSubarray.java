// Last updated: 9/25/2025, 12:23:57 PM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int s=1;
        
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                s++;
            }
            else{
                s=1;
            }
            ans=Math.max(s,ans);
        }
        for (int i=nums.length-1;i>0;i--){
            if(nums[i]<nums[i-1]){
                s++;
            }
            else{
                s=1;
            }
            ans=Math.max(s,ans);
        }
        return ans;
    }
}