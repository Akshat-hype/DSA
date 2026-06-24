// Last updated: 6/24/2026, 12:43:35 PM
// brute force 2
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int len =0;
4        for (int i=0;i<s.length();i++) {
5            String temp="";
6            for (int j=i;j<s.length();j++) {
7                char ch =s.charAt(j);
8                boolean flag = false;
9                for (int k=0;k<temp.length();k++) {
10                    if (temp.charAt(k)==ch) {
11                        flag =true;
12                        break;
13                    }
14                 
15                }
16                if (flag) {
17                    break;
18                }
19                temp+=s.charAt(j);
20            }
21            len=Math.max(len, temp.length());
22        }
23        return len;
24    }
25}