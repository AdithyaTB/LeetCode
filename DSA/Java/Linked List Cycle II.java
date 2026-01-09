
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode third = head , second = head;

        while (third != null && third.next != null) {
            third = third.next.next;
            second = second.next;

            if (second == third) break;
        }

        if (third == null || third.next == null) return null;

        third = head;
        while (third != second) {
            third = third.next;
            second = second.next;
        } 
        return second;
    }
}
