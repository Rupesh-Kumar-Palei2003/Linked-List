package BasicLinkedList;
/*
 ll-1 : 1-->3-->5-->7-->9-->11-->13
 ll-2 :         2-->4-->9-->11-->13
 answer = 9 because it is the 1st common or link between two linked list.
 # Hint 1 : find the length of two linked list
 # Hint 2 : increment the bigger linked list by (m - n)steps
                where m : length of bigger linked list.
                      n : length of smaller linked list.
 */
public class IntersectionOfTwoLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node findIntersectionNode(Node headA, Node headB){
        Node tempA = headA;
        Node tempB = headB;
        // length of the linked list.
        int lengthA = findLength(tempA);
        int lengthB = findLength(tempB);
        if(lengthA > lengthB){
            for(int i=0; i<lengthA-lengthB; i++){
                tempA = tempA.next;
            }
        }
        else{
            for(int i=0; i<lengthB-lengthA; i++){
                tempB = tempB.next;
            }
        }
       while(tempA != tempB){
           tempA = tempA.next;
           tempB = tempB.next;
       }
       return tempA;
    }
    public static int findLength(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
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
        // linked list -A
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(11);
        Node g = new Node(13);
        // linked list -B
        Node p = new Node(2);
        Node q = new Node(4);
        //connection between ll -1 and ll -2.
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; f.next = g;
        p.next = q; q.next = e;
        System.out.println("Linked list - A");
        displayLinkedList(a);
        System.out.println("Linked List - B");
        displayLinkedList(p);
        System.out.println("Intersection node is = "+findIntersectionNode(a, p).data);

    }
}
