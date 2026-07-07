// Last updated: 7/7/2026, 1:47:19 PM
// while loop brute force
1class Solution {
2    public long sumAndMultiply(int n) {
3        long x=0;
4        int sum=0;
5        long num=0;
6        while(n>0){
7            int rem=n%10;
8            if(rem!=0){
9                num=num*10+rem;                
10            }
11            n/=10;
12        }
13        while(num!=0){
14            long rem=num%10;
15            x=x*10+rem;
16            sum+=rem;
17            num/=10;
18        }
19        return x*sum;
20    }
21}