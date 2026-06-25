// Last updated: 6/25/2026, 1:04:43 PM
// prefix and suffix
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int product[]=new int[nums.length];
4        
5        product[0]=1;
6
7        for(int i=1;i<nums.length;i++){
8            product[i]=nums[i-1]*product[i-1];
9           
10        }
11        int suffix=1;
12        for(int i=nums.length-2;i>=0;i--){
13            suffix=nums[i+1]*suffix;
14            product[i]*=suffix;
15        }
16        return product;
17    }
18}