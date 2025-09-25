// Last updated: 9/25/2025, 12:23:41 PM
class Solution {
    public String findValidPair(String s) {
        int freq[] =new int [10];

        for (char ch:s.toCharArray()) {
            freq[ch-'0']++;
        }

        for (int i=0; i<s.length()-1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            int fd=0;
            int sd=0;

            if(first!=second){
                fd=first-'0';
                sd=second-'0';
            if(freq[fd]==fd&&freq[sd]==sd){
                return ""+first+second;
            }}
        }
        return "";
    }
}