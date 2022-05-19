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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode current = head;
        while(current.next != null)
        {
            count++;
            current = current.next;
        }
        if(count == 0){
                return head;
        }
        if(count % 2 != 0){
                count = count/2;
        }
        else
            count = (count/2) - 1;
        current = head;
        for(int i = 0; i<count ; i++)
        {
            current = current.next;
        }
        return current.next;
    }
}