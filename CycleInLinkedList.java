package BasicLinkedList;

public class CycleInLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean checkCycle(Node head){
        Node rabbit = head;
        Node turtle = head;
        while(rabbit != null){
            rabbit = rabbit.next.next;
            turtle = turtle.next;
            if(rabbit == turtle){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(3);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; f.next = b;
        System.out.println("is linked list cyclic ? \n"+checkCycle(a));

    }
}
