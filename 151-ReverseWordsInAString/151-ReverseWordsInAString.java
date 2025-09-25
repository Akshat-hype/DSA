// Last updated: 9/25/2025, 12:25:21 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String []arr=s.split(" ");
        String sum="";
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==""){
                continue;
            }
            else{
                sum+=arr[i]+" ";
            }
           
        }
        sum=sum+arr[0];
        return sum;
    }
}