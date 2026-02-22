class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        if( length == 1 ){
            return null;
        }

        int mid = length / 2;

        curr = head;
       

        for( int i = 0 ; i < mid - 1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return head;

    }
}
