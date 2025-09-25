// Last updated: 9/25/2025, 12:24:09 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        int n =part.length();
        int i=0;
        // int a=s.length()-n+1;
        while(s.contains(part)){
            if(s.substring(i,i+n).equals(part)){
                s=s.substring(0,i)+s.substring(i+n);
                i=0;
            }
            else{
                i++;
            }
            // System.out.println(s);
            // System.out.println(i);
            // a=s.length()-n;
        }
        return s;
    }
}