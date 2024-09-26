// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        ListNode ref = l1;
        ListNode l = new ListNode(ref.val);
        while(ref.next != null) {
            ref = ref.next;
            l.next = new ListNode(ref.val);
            l = l.next;
        }
        l.next = l2;
        return l;
    }
}
