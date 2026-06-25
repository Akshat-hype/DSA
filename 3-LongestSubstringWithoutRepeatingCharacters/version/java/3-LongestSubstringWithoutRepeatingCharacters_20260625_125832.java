// Last updated: 6/25/2026, 12:58:32 PM
// prefix and postfix
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int product[]=new int[nums.length];
4        int right[]=new int [nums.length];
5        int left[]=new int [nums.length];
6        
7        right[nums.length-1]=1;
8        left[0]=1;
9
10        for(int i=1;i<nums.length;i++){
11            left[i]=nums[i-1]*left[i-1];
12           
13        }
14        for(int i=nums.length-2;i>=0;i--){
15            right[i]=nums[i+1]*right[i+1];
16        }
17        for(int i=0;i<nums.length;i++){
18            product[i]=left[i]*right[i];
19        }
20        return product;
21    }
22}