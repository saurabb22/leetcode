class Solution {
    public int maxProfit(int[] prices) {
        int maxi = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<prices.length; i++){
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(prices[i]);
            }
            maxi = Math.max(maxi, prices[i]-st.peek());
        }
        return maxi;
    }
}