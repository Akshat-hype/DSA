// Last updated: 9/25/2025, 12:25:51 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n =nums.length;
        int f =-1; int la =-1;
        int l =0; int r =n-1;
        while(l<=r){
            int mid =l+(r-l)/2;
            if(nums[mid] ==target){
                f = mid;
                r=mid-1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            } 
            else{
                l=mid+1;
            } 
        }

        l =0; r =n-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(nums[mid]==target){
                la=mid;
                l=mid+1;
            }
            else if(nums[mid]>target){
               r=mid-1; 
            } 
            else{
                l=mid+1;
            } 
        }
        int arr[]={f,la};
        return arr;



        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         n[0]=i;
        //         break;
        //     }
        // }
        // for(int i=nums.length-1;i>=0;i--){
        //     if(nums[i]==target){
        //         n[1]=i;
        //         break;
        //     }
        // }
        // return n;
    }
}