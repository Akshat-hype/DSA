// Last updated: 6/24/2026, 10:21:38 AM
// single for loop
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int sum=0;
4        int j=mat.length-1;
5        for(int i=0;i<mat.length;i++){
6            sum+=mat[i][i];
7            sum+=mat[i][j];
8            j--;
9        } 
10        if(!(mat.length%2==0)){
11           sum-=mat[mat.length/2][mat.length/2];
12        }
13        return sum;
14    }
15}