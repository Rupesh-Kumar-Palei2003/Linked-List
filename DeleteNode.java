package BasicLinkedList;

// LeetCode - 237
/*
only node is given and delete the node.
 */
public class DeleteNode {
    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static  class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
