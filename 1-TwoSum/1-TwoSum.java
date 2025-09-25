// Last updated: 9/25/2025, 12:26:08 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int i=0;
        while(i<nums.length){
            int j=0;
            while(j<nums.length){
                if(i!=j){
                    if(nums[i]+nums[j]==target){
                        arr[0]=i;
                        arr[1]=j;
                    }
                }
                j++;
            }
            i++;
        }
        return arr;
    }
}