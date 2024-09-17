package BasicLinkedList;
/*
finding nth node form the end of linked list (condition : only head is given).
        return the node not value

solution : total node = m
            nth node from the last is = (m-n+1)th node from the start;

value        100     13      11      19      17      29
index start   1      2       3       4       5       6
index end     6      5       4       3       2       1

but we have to do using two pointer and without finding the size of the linked list and travers only one times.
 */
public class FindNthNodeFromTheEnd2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node findNthNodeFromLast(Node head, int indexLast){
        Node rabbit = head;
        Node turtle = head;
        for(int i=0; i<indexLast; i++){
            rabbit = rabbit.next;
        }
        while(rabbit.next != null){
            rabbit = rabbit.next;
            turtle = turtle.next;
        }
        return turtle.next;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(11);
        Node f = new Node(13);
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f;
        int data = findNthNodeFromLast(a, 4).data;
        System.out.println("4th index from the last is.. "+data);
    }
}
