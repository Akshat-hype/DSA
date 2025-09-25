// Last updated: 9/25/2025, 12:25:10 PM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==j){
                j++;
            }
            else{
                return j;
            }
        }
        return nums.length;
    }
}