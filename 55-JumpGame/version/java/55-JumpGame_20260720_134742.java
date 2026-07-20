// Last updated: 7/20/2026, 1:47:42 PM
// greedy
1class Solution {
2    public boolean canJump(int[] nums) {
3        int max=0;
4        for(int i=0;i<nums.length;i++){
5            if(i>max){
6                return false;
7            }
8            max=Math.max(max, nums[i]+i);
9            if(max>=nums.length-1){
10                return true;
11            }
12        }
13        return true;
14    }
15}