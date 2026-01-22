class Solution {
    public ListNode removeElements(ListNode head, int val) {
       ListNode res = new ListNode(0, head);
       ListNode dum = res;

       while (dum != null) {
           while (dum.next != null && dum.next.val == val) {
            dum.next = dum.next.next;
        }
         dum = dum.next; 
       } 
       return res.next;
    }
}
