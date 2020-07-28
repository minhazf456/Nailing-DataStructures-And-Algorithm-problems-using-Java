package LinkedList.FIndTheLengthOfLinkList;

public class CheckLength {
    public static void main( String args[] ) {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.insertAtEnd("This");
        list.insertAtEnd("list");
        list.insertAtEnd("is");
        list.insertAtEnd("Generic");
        list.printList();
        System.out.println("Length : " + list.length());
    }
}