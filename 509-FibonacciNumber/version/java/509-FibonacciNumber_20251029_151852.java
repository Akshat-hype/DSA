// Last updated: 10/29/2025, 3:18:52 PM
// bruteforce: recursion
class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
        if(n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}