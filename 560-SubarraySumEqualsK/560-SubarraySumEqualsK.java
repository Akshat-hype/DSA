// Last updated: 9/25/2025, 12:24:51 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int j=0;j<nums.length;j++) {
			int sum=0;
		for(int i=j;i<nums.length;i++) {
				sum=sum+nums[i];
				if(sum==k) {
					count++;
				}
			}
			
		}
        return count;
    }
}