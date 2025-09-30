/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        map.put(slow,count);
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
            if(!map.containsKey(slow)){
                map.put(slow,count);
            }else{
                return slow;
            }
        }
        return null;
    }
}