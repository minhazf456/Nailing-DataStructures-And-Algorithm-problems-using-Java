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

    /// inserts new data at the end of the linked list

    public void insertAtHead ( T data) {
        /// creating a new node and assigning it the new data value
        Node newNode = new Node();
        newNode.data = data;
        // linking head to the newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }
    // Helper Function to printList
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        Node temp = headNode;
        System.out.print("List : ");
        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }
}

