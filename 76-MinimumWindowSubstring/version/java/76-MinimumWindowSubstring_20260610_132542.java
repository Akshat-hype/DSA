// Last updated: 6/10/2026, 1:25:42 PM
// hashmap and sliding window
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() == 0 || t.length() == 0) {
4            return "";
5        }
6
7        Map<Character, Integer> countt = new HashMap<>();
8        for (int i = 0; i < t.length(); i++) {
9            int count = countt.getOrDefault(t.charAt(i), 0);
10            countt.put(t.charAt(i), count + 1);
11        }
12
13        int req = countt.size();
14
15        int l = 0, r = 0;
16
17        Map<Character, Integer> windowsize = new HashMap<>();
18
19        int form = 0;
20
21        int[] ans = {-1, 0, 0};
22
23        while (r < s.length()) {
24            char c = s.charAt(r);
25            int count = windowsize.getOrDefault(c, 0);
26            windowsize.put(c, count + 1);
27
28            if (countt.containsKey(c) && windowsize.get(c).intValue() == countt.get(c).intValue()) {
29                form++;
30            }
31
32            while (l <= r && form == req) {
33                c = s.charAt(l);
34
35                if (ans[0] == -1 || r - l + 1 < ans[0]) {
36                    ans[0] = r - l + 1;
37                    ans[1] = l;
38                    ans[2] = r;
39                }
40
41                windowsize.put(c, windowsize.get(c) - 1);
42                if (countt.containsKey(c) && windowsize.get(c).intValue() < countt.get(c).intValue()) {
43                    form--;
44                }
45
46                l++;
47            }
48
49            r++;
50        }
51
52        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
53    }
54}