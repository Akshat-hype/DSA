// Last updated: 9/25/2025, 12:25:19 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //  HashSet<ListNode> s = new HashSet<>();
        //  while(headA!=null){
        //     s.add(headA);
        //     headA=headA.next;
        //  }
        //  while(headB!=null){
        //     if(s.contains(headB)==true){
        //         return headB;
        //     }
        //     s.add(headB);
        //     headB=headB.next;
        //  }
        // return null;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=temp2){
            if(temp1==null){
                temp1=headB;
            }
            else{
                temp1=temp1.next;
            }

            if(temp2==null){
                temp2=headA;
            }
            else{
                temp2=temp2.next;
            }
        }
        return temp1;
    }
}