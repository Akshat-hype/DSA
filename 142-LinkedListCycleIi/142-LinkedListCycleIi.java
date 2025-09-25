// Last updated: 9/25/2025, 12:25:23 PM
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
       HashSet<ListNode> s = new HashSet<>();
        while(head != null){
            if(s.contains(head)==true){
                return head;
            }
            s.add(head);
            head=head.next;
        }
        return null;  
    }
}