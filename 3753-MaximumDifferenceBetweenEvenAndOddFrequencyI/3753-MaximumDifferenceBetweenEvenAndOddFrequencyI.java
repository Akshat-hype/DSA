// Last updated: 9/25/2025, 12:23:46 PM
class Solution {
    public int maxDifference(String s) {
        int freq[]=new int [26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        List <Integer> odd=new ArrayList<>();
        List <Integer> even=new ArrayList<>();
        for(int i=25;i>=0;i--){
            if(freq[i]==0){
                break;
            }
            else if(freq[i]%2==0){
                even.add(freq[i]);
            }
            else{
                odd.add(freq[i]);
            }
        }

        
        return odd.get(0)-even.get(even.size()-1) ;
    }
}