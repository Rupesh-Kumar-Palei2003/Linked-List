package BasicLinkedList;

/*
    Remove the Nth node from the last index by one traverse.
 */
public class RemoveNthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node removeNthNodeFromLast(Node head, int indexLast){
        Node turtle = head;
        Node rabbit = head;
        for(int i=0; i<indexLast; i++){
            rabbit = rabbit.next;
        }
        if(rabbit == null){
            head = head.next;
            return head;
        }
        while(rabbit.next != null){
            turtle = turtle.next;
            rabbit = rabbit.next;
        }
        turtle.next = turtle.next.next;
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
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(11);
        Node f = new Node(13);
        a.next = b; b.next = c; c.next = d; d.next= e; e.next = f;
        displayLinkedList(a);
        Node head = removeNthNodeFromLast(a, 2);
        displayLinkedList(head);


    }
}
