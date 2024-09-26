// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        try {
            
            ListNode ref = l1;
            while(ref.next != null) {
                ref = ref.next;
            }
            ref.next = l2;
            return l1;
        } 
        catch(NullPointerException e) {
            return l1;
        }
    }
}
