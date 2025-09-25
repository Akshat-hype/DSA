// Last updated: 9/25/2025, 12:24:07 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a[]=new int[nums.length];
        int even=0;
        int odd=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                a[even]=nums[i];
                even+=2;
            }
            else{
                a[odd]=nums[i];
                odd+=2;
            }
        }
        return a;
    }
}