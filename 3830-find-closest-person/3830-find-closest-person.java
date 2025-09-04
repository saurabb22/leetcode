class Solution {
    public int findClosest(int x, int y, int z) {
        int first = Math.abs(z-x);
        int sec=  Math.abs(z-y);
        if(first<sec){
            return 1;
        }
        else if(first==sec){
            return 0;
        }
        else{
            return 2;
        }
    }
}