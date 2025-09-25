// Last updated: 9/25/2025, 12:24:37 PM
class Solution {
    public int[] dailyTemperatures(int[] t) {
        // int arr[]=new int[temperatures.length];
        // for (int i=0;i<temperatures.length;i++){
        //     for (int j=i+1;j<temperatures.length;j++){
        //         if(temperatures[i]<temperatures[j]){
        //             arr[i]=j-i;
        //             break;
        //         }
        //     }
        // }
        // return arr;

        int ans[]=new int [t.length];
        Stack<Integer>st=new Stack<>();
        for(int i=t.length-1;i>=0;i--){
            while(!st.isEmpty()&&t[st.peek()]<=t[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}