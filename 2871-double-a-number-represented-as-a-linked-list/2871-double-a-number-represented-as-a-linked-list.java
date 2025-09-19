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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        Stack<Integer> st = new Stack<>();
        // adding to stack
        while(curr != null){
            st.push(curr.val);
            curr = curr.next;
        }
        // store temp data in curr
        curr=  null;
        // traversal and operation in stack and adding to the linkedlist
        int carry=0;
        while(!st.isEmpty()) {
            int data = st.pop();
            data = data * 2;
            // if(carry > 0){
                data = data+carry;
                int last = data%10;
                carry = data/10;
                ListNode node = new ListNode(last);
                node.next = curr;
                curr = node;
            // }
            
        }
        if(carry >0){
            ListNode node = new ListNode(carry);
            node.next = curr;
            curr = node;
        }

        
        return curr;
    }
}