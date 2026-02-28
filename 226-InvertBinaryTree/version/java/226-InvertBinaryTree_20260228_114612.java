// Last updated: 2/28/2026, 11:46:12 AM
// Chessboard
1class Solution {
2    public boolean squareIsWhite(String s) {
3        if(s.charAt(0)=='a'||s.charAt(0)=='c'||s.charAt(0)=='e'||s.charAt(0)=='g'){
4            if(s.charAt(1)=='2'||s.charAt(1)=='4'||s.charAt(1)=='6'||s.charAt(1)=='8'){
5                return true;
6            }
7            else{
8                return false;
9            }
10        }
11        else{
12            if(s.charAt(1)=='2'||s.charAt(1)=='4'||s.charAt(1)=='6'||s.charAt(1)=='8'){
13                return false;
14            }
15            else{
16                return true;
17            }
18        }
19    }
20}