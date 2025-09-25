// Last updated: 9/25/2025, 12:24:23 PM
class Solution {
    public int fib(int n) {
        int num=0;
        int num1=1;
        int sum=0;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            for(int i=2;i<=n;i++){
                int temp=num1;
                sum=num+num1;
                num=temp;
                num1=sum;
            }
        }
        return sum;
    }
}