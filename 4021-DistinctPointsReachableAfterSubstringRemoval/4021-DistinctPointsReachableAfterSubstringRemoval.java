// Last updated: 10/30/2025, 3:14:20 PM
class Solution {
    public int distinctPoints(String s, int k) {
        String brivandeko=s;

        int n = s.length();
        int[] prex=new int[n+1];
        int[] prey=new int[n+1];

        for (int i=0;i<n;i++) {
            char c=s.charAt(i);
            int dx=0, dy=0;
            if (c=='U') dy=1;
            else if (c =='D') dy= -1;
            else if (c =='L') dx= -1;
            else if (c =='R') dx= 1;

            prex[i+1] =prex[i]+dx;
            prey[i+1] =prey[i]+dy;
        }

        Set<String> distinctPositions = new HashSet<>();

        for (int i = 0; i <= n - k; i++) {
            int finalX = prex[i] + (prex[n] - prex[i + k]);
            int finalY = prey[i] + (prey[n] - prey[i + k]);
            distinctPositions.add(finalX + "," + finalY);
        }

        return distinctPositions.size();
    }
}