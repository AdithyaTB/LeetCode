class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return toBST(head, null);
    }

    private TreeNode toBST(ListNode head, ListNode tail) {
        if (head == tail) {
            return null;
        }

        ListNode second = head;
        ListNode third = head;

        while (third != tail && third.next != tail) {
            second = second.next;
            third = third.next.next;
        }
        
        TreeNode node = new TreeNode(second.val);
        node.left = toBST(head, second);
        node.right = toBST(second.next, tail);
        return node;
    }
}
