class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int carry = 0;
        ListNode cur = dummy;

        while( l1 != null || l2 != null || carry > 0){
            if( l1 != null ){
                carry += l1.val;
                l1 = l1.next;
            }
            if( l2 != null ){
                carry += l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(carry % 10);
            carry /= 10;
            cur = cur.next;
        }
        return dummy.next;
    }
}
