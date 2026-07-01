// Last updated: 7/1/2026, 9:42:21 AM
// hashmap and hashset
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        HashMap<Integer,Integer> freq=new HashMap<>();
4        for(int num:arr){
5            freq.put(num, freq.getOrDefault(num, 0) + 1);
6        }
7        boolean uniq = freq.size() == new HashSet<>(freq.values()).size();
8        return uniq;
9    }
10}