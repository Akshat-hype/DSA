// Last updated: 9/25/2025, 12:25:01 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> List = new ArrayList<String>();
        int a =1;
        int b=1;
        for(int i=1;i<=n;i++){
            if(i==3*a && i==5*b){
                a++;
                b++;
                List.add("FizzBuzz");
            }
            else if(i==3*a){
                a++;
                List.add("Fizz");
            }
            else if(i==5*b){
                b++;
                List.add("Buzz");
            }
            else{
                List.add(String.valueOf(i));
            }
        }
        return List;
    }
}