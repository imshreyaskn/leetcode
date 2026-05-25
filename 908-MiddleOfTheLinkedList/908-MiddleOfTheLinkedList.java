// Last updated: 5/25/2026, 4:29:04 PM
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode last = head;

        while (last != null && last.next != null) {
            middle = middle.next;
            last = last.next.next;
        }

        return middle;
    }
}
