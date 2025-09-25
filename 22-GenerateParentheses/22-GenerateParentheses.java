// Last updated: 9/25/2025, 12:25:57 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        para(n,0,0,"",l);
        return l;
    }
    public static void para(int n,int open,int close,String ans,List<String> l) {
		if(open==n&&close==n) {
			l.add(ans);
			return;
        }
        if(open<n)
		    para(n,open+1,close,ans+"(",l);
        if(open>close)
		    para(n,open,close+1,ans+")",l);

	}
}