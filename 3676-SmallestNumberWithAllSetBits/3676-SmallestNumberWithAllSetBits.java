// Last updated: 9/25/2025, 12:23:50 PM
class Solution {
    public int smallestNumber(int n) {
        if(1>=n){
            return 1;
        }
        else if(3>=n){
            return 3;
        }
        else if(7>=n){
            return 7;
        }
        else if(15>=n){
            return 15;
        }
        else if(31>=n){
            return 31;
        }
        else if(63>=n){
            return 63;
        }
        else if(127>=n){
            return 127;
        }
        else if(255>=n){
            return 255;
        }
        else if(511>=n){
            return 511;
        }
        else{
            return 1023;
        }
    }
}