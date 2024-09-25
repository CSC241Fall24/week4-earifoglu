// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(l1.val);
        ListNode ref = l1.next;
        l.next = new ListNode(ref.val);
        while(ref.next != null) {
            ref = ref.next;
            l = l.next;
            l.next = new ListNode(ref.val);
        }
        l.next = l2;
        return l;
    }
}
