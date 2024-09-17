package BasicLinkedList;

public class RemoveLinkedListElement {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode prevNode = dummyHead;
        ListNode currentNode = head;
        while(currentNode != null){
            if(currentNode.val == val){
                prevNode.next = currentNode.next;
            }
            else {
                prevNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        return dummyHead.next;
    }
}
