import java.util.List;

public class swapLinkedList {
    public ListNode_1 swapPairs(ListNode_1 head) {
        ListNode_1 dummy = new ListNode_1(0);
        dummy.next = head;
        ListNode_1 current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode_1 first = current.next;
            ListNode_1 second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }
}
