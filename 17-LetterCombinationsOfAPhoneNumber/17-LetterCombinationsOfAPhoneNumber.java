// Last updated: 9/25/2025, 12:26:01 PM
class Solution {
    static String d[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> l=new ArrayList<>();
        if(digits.length()==0){
            return l;
        }
        keypad(digits,"",l);
        return l;
    }
    public static void keypad(String s, String ans, List<String> l){
        if(s.length()==0){
            l.add(ans);
            return;
        }
        char ch=s.charAt(0);
        String p=d[ch-'0'];
        for(int i=0; i<p.length();i++){
            keypad(s.substring(1), ans+p.charAt(i),l);
        }
    }
}