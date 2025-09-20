class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: prefix sum 0 occurs once

        int ans = 0, prefix = 0;
        for (int num : nums) {
            // count odds
            prefix += (num % 2);

            // check if prefix - k exists
            if (map.containsKey(prefix - k)) {
                ans += map.get(prefix - k);
            }

            // update map
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return ans;
    }
}