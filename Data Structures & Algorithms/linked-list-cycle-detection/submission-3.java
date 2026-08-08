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
    public boolean hasCycle(ListNode slow) {
        if(slow==null) return false;
        ListNode fast = slow;
        while(fast!=null && slow !=fast.next)
        {
            slow = slow.next;
            if(fast.next !=null) fast = fast.next;
            if(fast.next !=null) fast = fast.next;
        }
        return fast.next == null? false:true;
    }
}
