class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String words[] = s.split("\\s+");
        String word = words[words.length-1];
        return word.length();
    }
}