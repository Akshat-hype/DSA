// Last updated: 6/24/2026, 10:21:04 AM
// single for loop
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] ans=new int[n*2];
4        int j=0;
5        for(int i=0;i<n;i++){
6            ans[j]=nums[i];
7            ans[++j]=nums[i+n];
8            j++;
9        }
10        return ans;
11    }
12}