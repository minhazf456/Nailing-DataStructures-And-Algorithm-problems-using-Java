package LinkedList;

public class ListDemo {
    public static void main(String args[]) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtEnd(i);
        }

        if(sll.searchNode(3)) {   // Calling search function
            System.out.println("Value: 3 is Found");
        }
        else {
            System.out.println("Value: 3 is not Found");
        }

        if(sll.searchNode(15)) {   // Calling search function
            System.out.println("Value: 15 is Found");
        }
        else {
            System.out.println("Value: 15 is not Found");
        }
    }
}

// THis one for InsertAt the end

//public class ListDemo {
//    public static void main( String args[] ) {
//        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
//        sll.printList();
//        for (int i = 1; i <= 10; i++) {
////            sll.insertAtHead(i);
////            sll.printList();
//            sll.insertAtEnd(i);
//            sll.printList();
//        }
//    }
//}

// This one for insert a node after the given node

//
//public class ListDemo {
//    public static void main( String args[] ) {
//        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
//        for (int i = 1; i <= 6; i++) {
//            sll.insertAtEnd(i); // inserting value at the tail of the list
//        }
//        sll.printList();
//
//        System.out.println ("\nInserting 8 after 2");
//        sll.insertAfter(8, 2);
//        sll.printList();   // calling insert after
//        System.out.println ("\nInserting 10 after 3");
//        sll.insertAfter (10, 3);   // calling insert after
//        sll.printList();
//    }
//}