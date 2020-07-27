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


    //Inserts new data at the end of the linked list
    public void insertAtEnd(T data) {
        //if the list is empty then call insertATHead()
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        //Creating a new Node with value data
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node last = headNode;
        //iterate to the last element
        while (last.nextNode != null) {
            last = last.nextNode;
        }
        //make newNode the next element of the last node
        last.nextNode = newNode;
        size++;
    }

    //inserts data after the given prev data node

//    public void insertAfter (T data, T previous){
//        Node newNode = new Node();
//        newNode.data = data;
//        // Start from the head node
//        Node currentNode = this.headNode;
//
//        while (currentNode != null && !currentNode.data.equals(previous)){
//            currentNode = currentNode.nextNode;
//            //if such a node was found
//            //then point our newNode to currentNode's nextElement
//            if (currentNode != null) {
//                newNode.nextNode = currentNode.nextNode;
//                currentNode.nextNode = newNode;
//                size++;
//            }
//        }

        /// Searches a value in the given LinkedList

        //Searches a value in the given list.
        public boolean searchNode(T data) {
            //Start from first element
            Node currentNode = this.headNode;

            //Traverse the list till you reach end
            while (currentNode != null) {
                if (currentNode.data.equals(data))
                    return true; //value found

                currentNode = currentNode.nextNode;
            }
            return false; //value not found
        }
    }