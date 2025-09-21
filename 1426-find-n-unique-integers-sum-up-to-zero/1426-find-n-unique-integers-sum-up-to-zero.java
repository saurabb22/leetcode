class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int half = n/2;
        int ind = 0;
        for(int i=1; i<=half; i++){
            ans[ind] = i;
            ind++;
            ans[ind] = -i;
            ind++;
        }
        if(n%2 != 0){
            ans[ind] = 0;
        }
        return ans;
    }
}