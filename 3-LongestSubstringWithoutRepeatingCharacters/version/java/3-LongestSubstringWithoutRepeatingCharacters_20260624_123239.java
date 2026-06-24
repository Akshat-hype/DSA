// Last updated: 6/24/2026, 12:32:39 PM
// brute force
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int len =0;
4        for (int i=0;i<s.length();i++) {
5            String temp="";
6            for (int j=i;j<s.length();j++) {
7                if (temp.contains(Character.toString(s.charAt(j)))) {
8                    break;
9                }
10                temp+=s.charAt(j);
11            }
12            len=Math.max(len, temp.length());
13        }
14        return len;
15    }
16}