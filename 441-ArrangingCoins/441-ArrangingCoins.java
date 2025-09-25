// Last updated: 9/25/2025, 12:24:57 PM
class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        for(int i=1;i>0;i++){
            n-=i;
            if(n<0){
                break;
            }
            else{
                count++;
            }
            
        }
        return count;
    }
}