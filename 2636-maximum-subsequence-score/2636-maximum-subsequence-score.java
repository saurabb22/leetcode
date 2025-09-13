class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;

        // Step 1: Pair nums2 with nums1
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums2[i]; // nums2 value
            pairs[i][1] = nums1[i]; // nums1 value
        }

        // Step 2: Sort pairs in descending order of nums2
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        // Step 3: Min-heap for nums1 values
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum = 0, maxScore = 0;

        // Step 4: Iterate pairs
        for (int i = 0; i < n; i++) {
            minHeap.add(pairs[i][1]);
            sum += pairs[i][1];

            // Keep only top k nums1 values
            if (minHeap.size() > k) {
                sum -= minHeap.poll();
            }

            // If we have exactly k elements, compute score
            if (minHeap.size() == k) {
                long score = sum * pairs[i][0]; // current nums2 = min
                maxScore = Math.max(maxScore, score);
            }
        }

        return maxScore;
    }
}