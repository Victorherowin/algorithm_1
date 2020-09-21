public class LinkedListCycle_2 {
    public ListNode_1 detectCycle(ListNode_1 head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode_1 slow = head;
        ListNode_1 fast = head;
        while(fast.next != null || fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode_1 slower = head;
                while(slower != fast) {
                    slower = slower.next;
                    fast = fast.next;
                }
                return slower;
            }
        }
        return null;
    }
}
