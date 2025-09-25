// Last updated: 9/25/2025, 12:24:59 PM
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet <Integer> t = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            t.add(nums[i]);
        }
        int count=-1;
        int ans=0;
        if(t.size()>=3){
            for(int n:t){
                count+=1;
                if(count==(t.size()-3)){
                    ans=n;
                    break;
                }
            }
        }
        else{
            for(int n:t){
                ans=n;
            }
        }
        return ans;
    }
}