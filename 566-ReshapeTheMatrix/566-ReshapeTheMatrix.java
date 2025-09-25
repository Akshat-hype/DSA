// Last updated: 9/25/2025, 12:24:47 PM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if((r*c)!=(row*col)){
            return mat;
        }
        else{
            int arr[][]=new int [r][c];
            int R=0;
            int C=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(C<c){
                        arr[R][C]=mat[i][j];
                        C++;
                    }
                    else{
                        R++;
                        C=0;
                        arr[R][C]=mat[i][j];
                        C++;
                    }
                }
            }
            return arr;

        }
    }
}