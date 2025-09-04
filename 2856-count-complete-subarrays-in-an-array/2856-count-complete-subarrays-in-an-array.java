class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count = 0;
        for(int i=0;i<nums.length; i++){
            Map<Integer,Integer> map = new HashMap<>();
            for(int j=i; j<nums.length; j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(map.size()==set.size()){
                    count++;
                }
            }
        }
        return count;
    }
}