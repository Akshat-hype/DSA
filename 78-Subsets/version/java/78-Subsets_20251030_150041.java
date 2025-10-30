// Last updated: 10/30/2025, 3:00:41 PM
// backtrack
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        bt(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void bt(List<List<Integer>> list , List<Integer> temp, int [] nums, int s){
        list.add(new ArrayList<>(temp));
        for(int i = s; i < nums.length; i++){
            temp.add(nums[i]);
            bt(list, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}