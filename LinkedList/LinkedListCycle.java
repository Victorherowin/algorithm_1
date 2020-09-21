class ListNode_2 {
      int val;
      ListNode_2 next;
      ListNode_2(int x) {
          val = x;
          next = null;
      }
  }

public class LinkedListCycle {
    public boolean hasCycle(ListNode_2 head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode_2 fast = head;
        ListNode_2 slow = head;
        while(fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
        }
        return false;
    }
}
