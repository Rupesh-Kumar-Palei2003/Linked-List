package BasicLinkedList;

public class DisplayLinkedListRecursive {
    public static void displayLinkedList(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayLinkedList(head.next);
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
        displayLinkedList(a);
    }

}


