public class ReverseLinkedList_2 {
    public ListNode_1 reverseList(ListNode_1 head) {
        if(head==null||head.next==null) {
            return head;
        }

        ListNode_1 node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
