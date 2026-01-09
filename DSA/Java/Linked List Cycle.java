
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode second = head;
        ListNode third = head;

        while(third != null && third.next != null) {
            third = third.next.next;
            second = second.next;

            if (third == second) {
                return true;
            }
        }
        return false;
    }
}
