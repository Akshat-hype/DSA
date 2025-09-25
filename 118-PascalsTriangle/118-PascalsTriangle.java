// Last updated: 9/25/2025, 12:25:34 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> innerList = new ArrayList<Integer>();
            int ncr=1;
            int k=0;
            for(int j=0;j<i+1;j++){
                innerList.add(ncr);
                ncr=ncr*(i-k)/(k+1);
                k++;
            }
            arr.add(innerList);
        }
        return arr;
    }
}