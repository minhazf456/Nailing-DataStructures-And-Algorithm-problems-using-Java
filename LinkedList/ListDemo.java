package LinkedList;

public class ListDemo {
    public static void main( String args[] ) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtHead(i);
            sll.printList();
        }
    }
}