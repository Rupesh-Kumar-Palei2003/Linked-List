package BasicLinkedList;
// find the length of the linked list where head is already given.
public class LengthLinkedList {
    public static int findLength(Node head){
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        return length;
    }

        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(6);
            Node c = new Node(7);
            Node d = new Node(8);
            Node e = new Node(9);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            System.out.println("Length of the Linked List is ..."+findLength(a));

        }
}

