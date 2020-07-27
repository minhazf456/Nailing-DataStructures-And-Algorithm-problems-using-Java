package LinkedList.SinglyLinkedListDeletion;

/// This one is for Deletion by value in SLL

 public class CheckDeletion {
     public static void main( String args[] ) {
         SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
         for (int i = 1; i <= 10; i++) {
             sll.insertAtHead(i);
         }
         System.out.println("Originial :");
         sll.printList();
         System.out.println("After deleting 10 from List: ");
         sll.deleteByValue(10);
         sll.printList();
         System.out.println("After deleting 9 from List: ");
         sll.deleteByValue(9);
         sll.printList();
         System.out.println("After deleting 1 from List: ");
         sll.deleteByValue(1);
         sll.printList();
         System.out.println("After deleting 21 from List: ");
         sll.deleteByValue(21);
         sll.printList(); // list remains unchanged as there is no element 21 in the list
     }
 }

 // This main function for Deletion at head

//     public static void main( String args[] ) {
//         SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
//         for (int i = 1; i <= 10; i++) {
//             sll.insertAtEnd(i);
//         }
//         sll.printList();
//         System.out.println("1: Calling Deletion At Head Function: ");
//         sll.deleteAtHead();
//         sll.printList();
//         System.out.println("2: Calling Deletion At Head Function: ");
//         sll.deleteAtHead();
//         sll.printList();
//     }
// }