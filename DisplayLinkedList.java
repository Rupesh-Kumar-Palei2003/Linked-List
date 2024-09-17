package BasicLinkedList;

public class DisplayLinkedList {
    public static class Node{
        int data; // storing the value of the node
        Node next; // storing the address of the next node

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(9);
        Node d = new Node(11);
        Node e = new Node(13);
        //connect each node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // to display the value of the node
        // case 1 : when size is known
        Node temp1 = a;
        for(int i=0; i<=4; i++){
            System.out.print(temp1.data+"-->");
            temp1 = temp1.next;
        }
        System.out.println();
        // case 2 : when size is unknown
        Node temp2 = a;
        while(temp2 != null){
            System.out.print(temp2.data+"-->");
            temp2 = temp2.next;
        }
    }
}
