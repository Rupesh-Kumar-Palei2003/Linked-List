package BasicLinkedList;
/*
finding nth node form the end of linked list (condition : only head is given).
        return the node not value

solution : total node = m
            nth node from the last is = (m-n+1)th node from the start;

value        100     13      11      19      17      29
index start   1      2       3       4       5       6
index end     6      5       4       3       2       1
 */
public class FindNthNodeFromTheEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node findNthNodeLast(Node head, int nodeIndex){
        Node temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        int mthNode = count-nodeIndex+1;
        for(int i=0; i<mthNode-1; i++){
            temp = temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(11);
        Node f = new Node(15);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(findNthNodeLast(a, 2).data);
    }
}
