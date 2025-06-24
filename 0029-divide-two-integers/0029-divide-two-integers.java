class Solution {
    public int divide(int dividend, int divisor) {
        int ans = 0;
        if(dividend==Integer.MIN_VALUE &&divisor == Integer.MIN_VALUE) {
            return 1;
        }else if(dividend == Integer.MAX_VALUE && divisor==Integer.MAX_VALUE) {
            return 1;
        }else if(dividend==Integer.MIN_VALUE && divisor==-1) {
            return Integer.MAX_VALUE;
        }else if(dividend==Integer.MIN_VALUE && divisor==1) {
            return Integer.MIN_VALUE;
        }else if(dividend==Integer.MAX_VALUE && divisor == Integer.MIN_VALUE){
            return 0;
        }else if(dividend==Integer.MIN_VALUE && divisor == Integer.MAX_VALUE) {
            return -1;
        }
        ans = dividend/divisor;
        return ans;
    }
}