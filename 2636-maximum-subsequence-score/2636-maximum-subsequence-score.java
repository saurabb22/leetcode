class Solution {
    class Pair{
        int nums2data;
        int nums1data;
        Pair(int nums2data, int nums1data){
            this.nums2data = nums2data;
            this.nums1data = nums1data;
        }
    }
    public long maxScore(int[] nums1, int[] nums2, int k) {
        long total = 0;
        long max = 0;
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            list.add(new Pair(nums2[i],nums1[i]));
        }

        list.sort((p1, p2) -> Integer.compare(p2.nums2data, p1.nums2data));
        // creating the meanheap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(Pair p: list){
            pq.add(p.nums1data);
            total = total+p.nums1data;

            if(pq.size()>k){
                total =total-pq.poll();
            }
            if(pq.size() == k){
                max = Math.max(max, total*p.nums2data);
            }
        }
        return max;
    }
}