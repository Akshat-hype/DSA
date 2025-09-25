// Last updated: 9/25/2025, 12:25:55 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        for(int j=1; j<nums.length;j++){
            if(nums[j-1]!=nums[j]){
                nums[i]=nums[j];
                i++;
            }
            
        }
        return i;
    }
}