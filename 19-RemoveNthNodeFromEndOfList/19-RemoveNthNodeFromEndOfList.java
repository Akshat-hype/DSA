// Last updated: 9/25/2025, 12:26:00 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int pos=len-n;
        if(pos==0){
            return head.next;
        }else{
            temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return head;
        }
    }
}