package BasicLinkedList;

public class DeleteElementInLinkedList {
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
        int size = 0;

        // insert at the head of linked list.
        void insertAtHead(int data){
            Node newNode = new Node(data);
            if(head == null && tail == null){
                head = tail = newNode;
            }
            else{
                newNode.next = head;
                head = newNode;
            }
            size++;
        }
        // insert at the tail of linked list.
        void insertAtTail(int data){
            Node newNode = new Node(data);
            if(head == null & tail == null){
                head = tail = newNode;
            }
            else{
                assert tail != null;
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }
        // insert at the given index of linked list
        void insertAt(int index, int data){
            Node newNode = new Node(data);
            Node temp = head;
            if(index == size){
                insertAtTail(data);
                return;
            }
            else if(index == 0){
                insertAtHead(data);
                return;
            }
            else if(index < 0 || index > size){
                System.out.println("index of bound....");
                return;
            }
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        void deleteAt(int index){
            Node temp = head;
            if(index < 0 && index > size){
                System.out.println("index of bound....");
                return;
            }
            if(index == 0){
                head = head.next;
                size--;
                return;
            }
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            if(temp.next == tail){
                tail = temp;
            }
            temp.next = temp.next.next;
            size--;
        }
        void displayLinkedList(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
        }
        int getData(int index){
            Node temp = head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtTail(5);
        ll.insertAtHead(3);
        ll.insertAtTail(7);
        ll.insertAtTail(9);
        ll.insertAtTail(11);
        ll.insertAtTail(13);
        ll.displayLinkedList();
        System.out.println("\n size of the linked list is = "+ll.size);
        ll.deleteAt(5);
        ll.displayLinkedList();
        System.out.print("\n size of the linked list is = "+ll.size);
        System.out.print("\n data of the tail = "+ll.tail.data);
        System.out.print("\n data of the 4 the index is = "+ll.getData(4));
    }
}
