
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        int count = 2;
        ListNode ref = head;
        boolean found = false;
        while(ref != null && position >= 2) {
            if(count == position) {
                found = true;
                break;
            }
            else if(ref.next == null) {
                ref.next = new ListNode(val);
                break;
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
                return head;
            }
            else if(position < 2) {
                ListNode newNode = new ListNode(val);
                newNode.next = ref;
                return newNode;
            }
            else {
                return null;
            }
        }

    }
}
