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
    int length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int m = length(headA);
        int n = length(headB);
        int diff = m - n;
        if(diff > 0){
            while(diff != 0){
                headA = headA.next;
                diff--;
            }
        }else if(diff < 0){
            diff = Math.abs(diff);
            while(diff != 0){
                headB = headB.next;
                diff--;
            }
        }
        int len = Math.min(m, n);
        for(int i=0; i<len; i++){
            if(headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}