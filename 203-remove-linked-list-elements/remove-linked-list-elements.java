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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode temp2 = temp;
        while(temp2.next!=null){
            if(temp2.next.val==val){
                temp2.next = temp2.next.next;
            }
            else{
                temp2 = temp2.next;
            }
        }
        return temp.next;
    }
}