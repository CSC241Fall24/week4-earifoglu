
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        int count = 1;
        ListNode ref = head;
        boolean found = false;
        while(head != null) {
            if(count == position) {
                found = true;
                break;
            }
            else if(ref.next == null) {
                ref.next = new ListNode(val);
            }
            ref = ref.next;
            count++;
        }
        if(found) {
            ListNode newNode = new ListNode(val);
            newNode.next = ref.next;
            ref.next = newNode;
            return head;
        } 
        else {
            if(head == null) {
                head = new ListNode(val);
            }
            return head;
        }

    }
}
