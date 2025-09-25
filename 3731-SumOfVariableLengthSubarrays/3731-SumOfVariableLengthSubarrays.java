// Last updated: 9/25/2025, 12:23:45 PM
class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int total=0;

        for(int i=0;i<n;i++){
            int start=Math.max(0,i-nums[i]);
            for(int j=start;j<=i;j++){
                total+=nums[j];
            }
        }
        return total;
    }
}