class Solution {
    public long subArrayRanges(int[] nums) {
        long max = 0;
        for(int i=0; i<nums.length; i++){
            int mini = nums[i];
            int maxi = nums[i];
            for(int j=i+1; j<nums.length; j++){
                mini = Math.min(mini,nums[j]);
                maxi = Math.max(maxi,nums[j]);
                int diff = maxi-mini;
                max = max + diff;
            }
        }
        return max;
    }
}