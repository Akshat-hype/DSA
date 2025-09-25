// Last updated: 9/25/2025, 12:24:54 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c1=0;
        int c2 =0;
        for (int i =0; i<nums.length;i++){
            if (nums[i]==1){
                c1++;
            }
            else{
                c1=0;
            }
            if (c2<c1){
                c2=c1;
            }
        }
        return c2;
    }
}