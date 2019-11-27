/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//         虚假的新头
//         初始化节点为0的空节点
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        int length = 0;
        ListNode first = head;
        while(first != null){
            length ++;
            first = first.next;
        }
        int mid;
        mid = length - n;
        first = newHead;
        while(mid > 0){
            mid --;
            first = first.next;
        }
        first.next = first.next.next;
        return newHead.next;
    }
}
