package BasicLinkedList;

public class PalindromeLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public boolean isPalindrome(ListNode head) {
        ListNode start = head;
        ListNode middle = findMiddle(head);
        while(middle.next != null){
            if(start.val != middle.val){
                return false;
            }
            start = start.next;
            middle = middle.next;
        }
        return true;
    }
        public ListNode findMiddle(ListNode head){
        ListNode rabbit = head;
        ListNode turtle = head;
        while(rabbit != null && rabbit.next != null){
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
}
