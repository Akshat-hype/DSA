// Last updated: 6/25/2026, 12:41:02 PM
// brute force
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int product[]=new int[nums.length];
4        int totalpro=1;
5        int count=0;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]!=0){
8                totalpro*=nums[i];
9            }
10            else{
11                count+=1;;
12            }
13        }
14        for(int i=0;i<nums.length;i++){
15            if(nums[i]!=0&&count>0){
16                product[i]=0;           //if arr contain 0 but the current no. is not 0
17            }
18            else if(count==0){
19                product[i]=totalpro/nums[i];   //if arr does not conatin 0
20            }
21            else if(count>1){
22                product[i]=0;
23            }
24            else{
25                product[i]=totalpro;         // if arr contain only one 0 and current no. is 0
26            }
27        }
28        return product;
29    }
30}