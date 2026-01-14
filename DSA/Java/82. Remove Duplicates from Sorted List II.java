class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        if(head.val == head.next.val) {
            int val = head.val;
            while(head != null && head.val == val) 
                head = head.next;
            return deleteDuplicates(head);
        }
        head.next = deleteDuplicates(head.next);
        return head;
    }
}
