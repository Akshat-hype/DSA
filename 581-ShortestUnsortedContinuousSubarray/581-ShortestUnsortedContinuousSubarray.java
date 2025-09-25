// Last updated: 9/25/2025, 12:24:44 PM
class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int n= nums.length;
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(nums);
        int min =0;
        int max =0;

        for (int i=0; i<nums.length; i++){
            if (arr[i]!=nums[i]){
                min=i-1;
                break;
            }
        }
        for (int i=nums.length-1;i>=0; i--){
            if (arr[i]!=nums[i]){
                max=i;
                break;
            }
        }
        
        int total = max-min;
        return total;
        
    }
}