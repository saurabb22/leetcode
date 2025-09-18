class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char str[] = s.toCharArray();
        char tt[] = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(tt);

        int i=  0;
        while(i<str.length){
            if(str[i]!= tt[i]) return false;
            i++;
        }
        return true;
    }
}