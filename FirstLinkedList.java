package BasicLinkedList;

public class FirstLinkedList {
    public  static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.println("value of each node");
        System.out.println(a.data+"->"+b.data+"->"+c.data+"->"+d.data);
        System.out.println("address of each node");
        System.out.println(a.next+"->"+b.next+"->"+c.next+"->"+d.next);
        System.out.println("address of the current node ");
        System.out.println(a+" "+b+" "+c+" "+d);
        System.out.println("value accessed by current node");
        System.out.println(a.data+" "+a.next.data+" "+b.next.data+" "+c.next.data);
    }
}
