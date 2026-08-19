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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = null;
        while(temp!=null){
            ListNode temp2 = temp.next;
            temp.next = temp1;
            temp1 = temp;
            temp = temp2;
        }
        return temp1;
    }
}