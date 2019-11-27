/**
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.
说明：

给定的 n 保证是有效的。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
