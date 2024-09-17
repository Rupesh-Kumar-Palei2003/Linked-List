package BasicLinkedList;

public class InsertElementInLinkedList {
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
         void insertAtHead(int data){
             Node temp = new Node(data);
             if(head == null & tail == null ){
                 head = tail = temp;
             }
             else{
                 temp.next = head;
                 head = temp;
             }
         }
         void insertAtTail(int data){
             Node temp = new Node(data);
             if(head == null & tail == null){
                 head = tail = temp;
             }
             else{
                 assert tail != null;
                 tail.next = temp;
                 tail = temp;
             }
         }
         void insertAt(int index, int data){
                Node newNode = new Node(data);
                Node temp = head;
             if(index == sizeOfLinkedList()){
                 insertAtTail(data);
                 return;
             }
             else if(index == 0){
                 insertAtHead(data);
                 return;
             }
             else if(index < 0 || index > sizeOfLinkedList()){
                 System.out.println("index of bound.......");
                 return;
             }
                for(int i=0; i<index; i++){
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;


         }
         void displayLinkedList(){
             Node temp = head;
             while(temp != null){
                 System.out.print(temp.data+"-->");
                 temp = temp.next;
             }
         }
         int sizeOfLinkedList(){
             Node temp = head;
             int count = 0;
             while(temp != null){
                 count++;
                 temp = temp.next;
             }
             return count;
         }

     }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtHead(5);
        ll.insertAtHead(7);
        ll.insertAtTail(9);
        ll.insertAt(3, 11);
        ll.insertAt(0, 99);
        ll.insertAt(ll.sizeOfLinkedList(), 121);
        System.out.println("size of the linked list is = "+ll.sizeOfLinkedList());
        ll.displayLinkedList();
        ll.insertAt(8, 132);
    }
    
}
