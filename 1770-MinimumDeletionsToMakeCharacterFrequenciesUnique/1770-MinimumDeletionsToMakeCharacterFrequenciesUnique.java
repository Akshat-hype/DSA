// Last updated: 9/25/2025, 12:24:17 PM
class Solution {
    public int minDeletions(String s) {
        int count=0;
        HashMap<Character, Integer> ch = new HashMap<>();
        for (char c : s.toCharArray()) {
            ch.put(c, ch.getOrDefault(c, 0) + 1);
        }
        HashSet<Integer> u = new HashSet<>();
        for(int i:ch.values()){
            while(i>0 && u.contains(i)) {
                count+=1;
                i--;
            }
            if (!u.contains(i)) {
                u.add(i);
            }
        }
        return count;
    }
}