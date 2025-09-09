/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] list) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<list.length; i++){
            ListNode node = list[i];
            while(node != null){
                pq.add(node.val);
                node = node.next;                
            }
        }
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while(!pq.isEmpty()){
            current.next = new ListNode(pq.poll());
            current=  current.next;
        }
        return dummy.next;
    }
}