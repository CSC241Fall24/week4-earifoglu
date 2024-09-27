// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {

        if(l1 != null && l2 != null) {
            ListNode ref = l1;
            while(ref.next != null) {
                ref = ref.next;
            }
            ref.next = l2;
            return l1;
        }
        else if(l1 == null && l2 != null) {
            return l2;
        }
        else if(l1 != null && l2 == null) {
            return l1;
        }
        else {
            return null;
        }
        
        
    }
}
