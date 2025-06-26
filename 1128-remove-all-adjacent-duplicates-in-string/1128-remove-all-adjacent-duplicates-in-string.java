class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }else{
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        String str = "";
        while(!st.isEmpty()) {
            str = str + st.pop();
        }
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        return rev;
    }
}