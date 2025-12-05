class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length-1; i>=0; i--){
            sb.append(s[i]);
        }
        for(int i=0; i<sb.length(); i++){
            s[i] = sb.charAt(i);
        }
    }
}