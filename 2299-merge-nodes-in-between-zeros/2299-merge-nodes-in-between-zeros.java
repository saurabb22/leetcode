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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode ans = new ListNode(0);
        ListNode curr1=ans;
        while (curr != null) {
            int temp = 0;
            if (curr.val == 0) {
                temp = 0;
            }else{
                while(curr.val != 0 && curr != null){
                    temp += curr.val;
                    curr = curr.next;
                }
                ans.next = new ListNode(temp);
                ans = ans.next;

            }
            curr = curr.next;
        }
        return curr1.next;
    }
}