package BasicLinkedList;

public class DeleteMiddleNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node deleteMiddleNode(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node turtle = head;
        Node rabbit = head;
        Node prevTurtle = null;
        while(rabbit != null && rabbit.next != null){
            prevTurtle = turtle;
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }
        prevTurtle.next = turtle.next;
        return head;
    }
    public static void displayLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; //f.next = g;
        displayLinkedList(a);
        System.out.println(deleteMiddleNode(a));
        displayLinkedList(a);


    }
}
