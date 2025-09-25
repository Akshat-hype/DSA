// Last updated: 9/25/2025, 12:24:30 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int ans=0;
        int hi = 1000000001;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if (isitpossible(piles,h,mid)){
                ans = mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;

    }
    public static boolean isitpossible(int [] piles, int h, int mid){
        int i=0;
        long hr = 0;
        while (i<piles.length){
            int a=piles[i]/mid;
            int b = piles[i]%mid;
            if (b==0){
                hr+=a;
            }
            else{
                hr+=(a+1);
            }
            i++;
        }
        if (hr<=h){
            return true;
        }
        else{
            return false;
        }
    }
}