package ArraysAndString;

import java.util.LinkedList;
public class CreatingLinkedList {

    public static void main(String[] args) {

        // Create a Linked List
        LinkedList<String> students = new LinkedList<>();

        // Add students to Linked List
        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");

        System.out.println( "first entire linked list is " + students);
        System.out.println();
        System.out.println();
        System.out.println( "Lets start modifying the linked list ");

        students.addFirst("Sarah");
        students.addLast("Hailey");
        students.add(2, "Tara");
        students.add(4, "minhaz");

        String firstStudent = students.getFirst();
        System.out.println("First " + firstStudent);
        String lastStudent = students.getLast();
        System.out.println("Last " + lastStudent);
        System.out.println(students.size());
        System.out.println(students);

        String secondStudent = students.get(1);
        System.out.println("Second " + secondStudent);

        int i = students.indexOf("Morgan");
        System.out.println("Index of Morgan " + i);

        students.removeFirst();
        students.removeLast();
        students.remove("Jamie");
        students.remove(1);
        System.out.println(students);

        boolean hasTaylor = students.contains("Taylor");
        System.out.println(hasTaylor);

        students.clear();
        System.out.println(students);
    }
}
