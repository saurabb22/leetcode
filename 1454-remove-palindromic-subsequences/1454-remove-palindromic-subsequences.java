class Solution {
    public int removePalindromeSub(String s) {
        boolean isPalindrome = true;
        int i=0;
        int j= s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) isPalindrome = false;
            i++;
            j--;
        }
        if(isPalindrome==true){
            return 1;
        }
        return 2;
    }
}