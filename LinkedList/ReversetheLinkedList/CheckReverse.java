package LinkedList.ReversetheLinkedList;

class CheckReverse {
    public static void main( String args[] ) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        for(int i = 0; i < 15; i+=2)
            list.insertAtEnd(i);
        System.out.print("Before ");
        list.printList();
        reverse(list);
        System.out.print("After ");
        list.printList();
    }
    public static <T> void reverse(SinglyLinkedList<T> list){
        SinglyLinkedList<T>.Node previous = null; //To keep track of the previous element, will be used in swapping links
        SinglyLinkedList<T>.Node current = list.headNode; //firstElement
        SinglyLinkedList<T>.Node next = null;

        //While Traversing the list, swap links
        while (current != null) {
//         // copy a pointer to the next element
//        // before we overwrite current.nextNode
            next = current.nextNode;
//              // reverse the 'next' pointer
            current.nextNode = previous;
//              // step forward in the list
            previous = current;
            current = next;

        }
        //Linking Head Node with the new First Element
        list.headNode = previous;
    }
}

//    Time Complexity #
//        The algorithm runs in O(n) since the list is traversed once.