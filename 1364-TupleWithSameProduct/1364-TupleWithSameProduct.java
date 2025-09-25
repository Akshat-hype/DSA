// Last updated: 9/25/2025, 12:24:19 PM
class Solution {

    public int tupleSameProduct(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1;j < n;j++) {
                map.put(nums[i] * nums[j],map.getOrDefault(nums[i] * nums[j],0) +1);
            }
        }

        for (int num : map.keySet()) {
            int freq = map.get(num);
            int pair =((freq - 1) * freq) / 2;

            ans += 8 * pair;
        }

        return ans;
    }
}