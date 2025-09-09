class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        // sort the array first
        Arrays.sort(nums);

        // finding the mid of the element
        int mid = nums.length/2;

        // check for the operation
        long ops = Math.abs((long)nums[mid]-(long)k);
        if(nums[mid]>k){
            for(int i=mid-1; i>=0; i--){
                if(nums[i]>k){
                    ops = ops+ Math.abs(nums[i]-k);
                }else{
                    break;
                }
                
            }
        }else if(nums[mid]<k){
            for(int i=mid+1; i<nums.length; i++){
                if(nums[i]<k){
                    ops = ops+Math.abs(nums[i]-k);
                }else{
                    break;
                }
            }
        }
        return ops;
    }
}