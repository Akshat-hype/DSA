// Last updated: 9/25/2025, 12:26:03 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        String ans="";
        for(int j=0;j<Math.min(strs[0].length(),strs[n-1].length());j++){
            if(strs[0].charAt(j)==strs[n-1].charAt(j)){
                ans+=strs[0].charAt(j);
            }
            else{
                break;
            }
        }
        return ans;
    }
}