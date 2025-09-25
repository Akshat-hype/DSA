// Last updated: 9/25/2025, 12:25:39 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=0,a=0,b=0;
        while(i<matrix.length||j<matrix[0].length){
            boolean flag=false;
            if(matrix[i][j]==target){
                return true;
            }
            if(j<matrix[0].length-1 && matrix[i][j+1]<=target){
                a=i;
                b=j+1;
                flag=true;
            }
            if(i<matrix.length-1 && matrix[i+1][j]<=target){
                a=i+1;
                b=j;
                flag=true;
            }
            if(!flag){
                return false;
            }
            i=a;
            j=b;
        }
        return false;
    }
}