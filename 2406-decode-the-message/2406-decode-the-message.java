class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        boolean[] visited = new boolean[26];
        char letter = 'a';

        for(char ch: key.toCharArray()){
            if(ch!=' ' && !visited[ch-'a']) {
                map[ch - 'a'] = letter;
                visited[ch-'a'] = true;
                letter++;
            }
        }
        String ans = "";
        for(char ch: message.toCharArray()) {
            if(ch == ' '){
                ans = ans + " ";
            }else{
                ans = ans + map[ch-'a'];
            }
        }
        return ans;
    }
}