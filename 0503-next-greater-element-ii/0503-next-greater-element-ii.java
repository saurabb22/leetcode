class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = Integer.MIN_VALUE;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]>nums[i]){
                    ans[i] = nums[j];
                    break;
                }
            }
            if(ans[i]==Integer.MIN_VALUE){
                for(int k=0; k<i; k++){
                    if(nums[k]>nums[i]){
                        ans[i]=  nums[k];
                        break;
                    }
                }
            }
            if(ans[i]==Integer.MIN_VALUE) {
                ans[i]=-1;
            }
        }
        return ans;
    }
}