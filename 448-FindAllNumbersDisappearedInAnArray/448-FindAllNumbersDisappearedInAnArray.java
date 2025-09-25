// Last updated: 9/25/2025, 12:24:56 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList <Integer> a=new ArrayList<>();
        TreeSet <Integer> num=new TreeSet<>();
        for (int x:nums){
            num.add(x);
        }
        

        for(int i=1; i<=nums.length;i++){
            if(!(num.contains(i))){
                a.add(i);
            }
        }
        return a;
    }
}