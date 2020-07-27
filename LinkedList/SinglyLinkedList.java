package LinkedList;

public class SinglyLinkedList <T>{
    // node inner class for SLL
    public class Node {
        public T data;
        public Node nextNode;
    }
    /// member variables
    public Node headNode; // head node of the linkedList
    public int size; // size of the linkedList
    //Constructor - initializes headNode and size
    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }
/// helper function that checks if list is empty or not

    public boolean isEmpty(){
        if (headNode == null) return true;
        return false;
    }


}
