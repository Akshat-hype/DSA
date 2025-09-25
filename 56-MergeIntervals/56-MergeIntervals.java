// Last updated: 9/25/2025, 12:25:43 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        int k = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.get(k);
            int[] curr = intervals[i];

            if (curr[0] <= last[1]) { 
                last[0] = Math.min(last[0], curr[0]);
                last[1] = Math.max(last[1], curr[1]);
            } else {  
                result.add(curr);
                k++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}