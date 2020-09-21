public class ReverseLinkedList {
    public ListNode_1 reverseKGroup(ListNode_1 head, int k) {
        ListNode_1 dummy = new ListNode_1(0);
        dummy.next = head;

        ListNode_1 pre = dummy;
        ListNode_1 end = dummy;

        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) end = end.next;
            if (end == null) break;
            ListNode_1 start = pre.next;
            ListNode_1 next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    private ListNode_1 reverse(ListNode_1 head) {
        ListNode_1 pre = null;
        ListNode_1 curr = head;
        while (curr != null) {
            ListNode_1 next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
