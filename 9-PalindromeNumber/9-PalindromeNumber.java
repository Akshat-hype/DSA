// Last updated: 9/25/2025, 12:26:04 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int rev=0;
            int t=x;
		while(x>0) {
			int rem=x%10;
			rev=(rev*10)+rem;
			x/=10;
		}
        if(rev==t){
            return true;
        }
        else{
            return false;
        }
        }
    }
}