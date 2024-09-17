package BasicLinkedList;

public class ImplementationLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        void insertAtTail(int value){
            Node temp = new Node(value);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtHead(int value){
            Node temp = new Node(value);
            if(head == null & tail == null){
                head = tail = temp;
//                insertAtTail(value); if the list is null then call the insertAtTail() function it work same.
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        void displayLinkedList(){
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
            System.out.println();
        }
        void sizeOfLinkedList(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                temp = temp.next;
                count++;
            }
            System.out.println("size of the linked list is : "+count);
        }
    }

    public static void main(String[] args) {
        linkedList obj = new linkedList();
        obj.insertAtHead(3);
        obj.insertAtTail(5);
        obj.insertAtTail(7);
        obj.insertAtTail(9);
        obj.insertAtTail(11);
        obj.insertAtTail(13);
        obj.insertAtHead(1);
        obj.displayLinkedList();
        obj.sizeOfLinkedList();
    }
}
