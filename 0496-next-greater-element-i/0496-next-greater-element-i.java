class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // nums2 ke elements ka index map me daal do
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int arr[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int indexInNums2 = map.get(nums1[i]);  // nums1[i] ka index nums2 me
            arr[i] = -1;  // default agar koi next greater na mile

            // ab check karo nums2 me aage koi greater hai kya
            for (int j = indexInNums2 + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    arr[i] = nums2[j];
                    break;  // pehle hi greater mil gaya to stop
                }
            }
        }

        return arr;
    }
}