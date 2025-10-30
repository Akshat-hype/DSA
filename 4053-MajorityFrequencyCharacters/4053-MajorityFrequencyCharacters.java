// Last updated: 10/30/2025, 3:14:13 PM
class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        HashMap <Integer,Integer> freq=new HashMap<>();
        for(int i:map.values()){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        int max=0;
        int f=0;
        for(int i:freq.keySet()){
            if(freq.get(i)>=f){
                max=i;
                f=freq.get(i);
            }
        }
        String str="";
        for(char ch:map.keySet()){
            if(map.get(ch)==max){
                str+=ch;
            }
        }
        return str;
    }
}