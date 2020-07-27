package LinkedList.SinglyLinkedListDeletion;

 public class CheckDeletion {
    public static void main( String args[] ) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtEnd(i);
        }
        sll.printList();
        System.out.println("1: Calling Deletion At Head Function: ");
        sll.deleteAtHead();
        sll.printList();
        System.out.println("2: Calling Deletion At Head Function: ");
        sll.deleteAtHead();
        sll.printList();
    }
}