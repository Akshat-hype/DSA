// Last updated: 9/7/2026, 7:33:10 PM
// recursion solution
1class Solution {
2    public double myPow(double x, int n) {
3        long nn=n;
4        if(nn<0){
5            nn=-nn;
6        }
7        double ans=pow(x,nn);
8        if(n<0)
9            return 1.0/ans;
10
11        return ans;
12    }
13    public double pow (double x, long n){
14        if(n==0)
15            return 1.0;
16        double half=pow(x,n/2);
17        if(n%2==0)
18            return half*half;
19
20        return x*half*half;
21    }
22}