// Last updated: 4/20/2026, 11:06:18 PM
// hashmap approach
1class Solution {
2    public String kthDistinct(String[] s, int k) {
3        HashMap<String, Integer> freq = new HashMap<>();
4        for (String str : s) {
5            freq.put(str, freq.getOrDefault(str, 0) + 1);
6        }
7        int count = 0;
8        for (int i = 0; i < s.length; i++) {
9            if (freq.get(s[i]) == 1) {
10                count++;
11                freq.put(s[i], -1);
12                if (count == k) {
13                    return(s[i]);
14                }
15            }
16        }
17
18        return("");
19    }
20}