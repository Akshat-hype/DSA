// Last updated: 9/25/2025, 12:25:32 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> innerList = new ArrayList<Integer>();
        long ncr=1;
        int k=0;
        for(int j=0;j<=rowIndex;j++){
            innerList.add((int)ncr);
            ncr=ncr*(rowIndex-k)/(k+1);
            k++;
        }
        return innerList;
    }
}