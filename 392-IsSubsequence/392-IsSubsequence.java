// Last updated: 9/25/2025, 12:25:02 PM
class Solution {
    public boolean isSubsequence(String t, String s) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        return j==t.length();
    }
}