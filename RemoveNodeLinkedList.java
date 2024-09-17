package BasicLinkedList;

/*
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 */
public class RemoveNodeLinkedList {
    public static class  ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

        public static ListNode removeElements(ListNode head, int val) {
            ListNode temp = head;
            while(temp.next != null){
                if(temp.val == val){
                    temp = temp.next;
                    temp.next = temp.next.next;
                }
            }
            return head;
        }
    public static void displayLinkedList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(6);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(6);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; f.next = g;
        displayLinkedList(a);
        removeElements(a, 5);
        displayLinkedList(a);
    }
}
