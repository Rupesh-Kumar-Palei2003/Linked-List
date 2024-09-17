package BasicLinkedList;

public class MiddleOfLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node findMiddleNode(Node head){
        Node rabbit = head;
        Node turtle = head;
        while(rabbit != null && rabbit.next != null){
            rabbit = rabbit.next.next;
            turtle = turtle.next;
            if(rabbit.next == null){    // for odd number of nodes in linked list.
                return turtle;
            }
            else if(rabbit.next.next == null){      // for even number of nodes in linked list.
                return turtle;
            }
        }
        return turtle;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
//        Node g = new Node(7);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; //f.next = g;
        System.out.println("Middle of the linked list is = "+findMiddleNode(a).data);

    }
}
