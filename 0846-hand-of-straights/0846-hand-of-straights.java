class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize !=0) return false;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i< hand.length; i++){
            pq.offer(hand[i]);
        }
        while(!pq.isEmpty()) {
            int start = pq.peek();
            for(int i=start; i<start+groupSize; i++){
                if(!pq.remove(i)){
                    return false;
                }
            }
        }        
        return true;
    }
}