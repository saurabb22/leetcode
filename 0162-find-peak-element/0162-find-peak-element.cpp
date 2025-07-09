class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int n =nums.size();
        int max=INT_MIN;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxi=i;


            }
        }
        return maxi;
    }
};