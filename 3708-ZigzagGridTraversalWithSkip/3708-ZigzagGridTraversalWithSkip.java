// Last updated: 9/25/2025, 12:23:40 PM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int m=grid.length;
        int n =grid[0].length;
        // int rep;
        // int r=0,c=0;
        // if((m*n)%2==0){
        //     rep=((m*n)/2);
        // }
        // else{
        //     rep=((m*n)/2)+1;
        // }
        ArrayList <Integer> arr=new ArrayList<Integer>();
        // for(int i=0;i<rep;i++){
        //     if(r%2==0&&c!=n-1){
        //         arr.add(grid[r][c]);
        //         c+=2;
        //     }
        //     else if(c!=n-1){
        //         arr.add(grid[r][c]);
        //         c-=2;
        //     }
        // }

        for (int i=0; i<m;i++){
            if (i%2==0){
                for (int j=0; j<n; j+=2){
                    arr.add(grid[i][j]);
                }
            }
            else{
                for (int j=n-1; j>0; j--){
                    if (j%2!=0){
                        arr.add(grid[i][j]);
                    }
                }
            }
        }
        return arr;
    }
}