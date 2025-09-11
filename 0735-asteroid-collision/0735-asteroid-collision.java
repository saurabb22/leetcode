class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                st.push(arr[i]);
            }else{
                // boolean destroyed = false;
                while(!st.isEmpty() && st.peek()>0 && st.peek() < Math.abs(arr[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(arr[i])){
                    st.pop();
                    // destroyed = true;
                }else if(st.isEmpty() || st.peek() <0){
                    st.push(arr[i]);
                }else{
                    // destroyed = true;
                }
            }

        }
        int ans[] = new int[st.size()];
        for(int i=ans.length-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}