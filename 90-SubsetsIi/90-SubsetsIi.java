// Last updated: 10/30/2025, 3:15:52 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        bt(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void bt(List<List<Integer>> list, List<Integer> temp, int [] nums, int s){
        list.add(new ArrayList<>(temp));
        for(int i=s; i<nums.length; i++){
            if(i>s && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            bt(list, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    } 
}