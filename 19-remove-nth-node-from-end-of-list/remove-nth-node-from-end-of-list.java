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
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode temp1 = temp;
        ListNode temp2 = temp;
        for(int i = 0;i<=n;i++){
            temp1 = temp1.next;
        }
        while(temp1!=null){
            temp2 = temp2.next;
            temp1=temp1.next;
        }
        temp2.next = temp2.next.next;
        return temp.next;
    }
}