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
        ListNode temp = head;
        int d=0;
        while(temp!=null){
            d++;
            temp=temp.next;
        }
        temp=head;

        if(n==d){
            head=head.next;
            return head;
        }
        
        for(int i=0;i<d-n-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        
        return head;
    }
}