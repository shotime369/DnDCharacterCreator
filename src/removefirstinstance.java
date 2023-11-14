import java.util.LinkedList;

public class removefirstinstance {

    // Java code to demonstrate removeFirstOccurrence() method
    public static void main(String[] args) {

        // Creating a LinkedList object
        LinkedList<String> list = new LinkedList<String>();

        // Adding an element at the last
        list.addLast("one");

        // Adding an element at the last
        list.addLast("two");

        // Adding an element at the last
        list.addLast("three");

        // Adding an element at the last
        list.addLast("one");

        System.out.print("List before removing the " +
                "first Occurrence of \"one\" : ");

        // Printing the list
        System.out.println(list);

        // Removing first occurrence of one.
        boolean returnValue = list.removeFirstOccurrence("one");

        // Printing the returned value
        System.out.println("Returned Value : " + returnValue);

        System.out.print("List after removing the" +
                " first Occurrence of \"one\" : ");

        // Printing the list
        System.out.println(list);
    }

    public static void intList () {

        // Creating a LinkedList object
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Adding an element at the last
        list.addLast(10);

        // Adding an element at the last
        list.addLast(20);

        // Adding an element at the last
        list.addLast(30);

        // Adding an element at the last
        list.addLast(10);

        System.out.print("List before removing the" +
                " first Occurrence of \"10\" : ");

        // Printing the list
        System.out.println(list);

        // Removing first occurrence of one.
        boolean returnValue = list.removeFirstOccurrence(10);

        // Printing the returned value
        System.out.println("Returned Value : " + returnValue);

        System.out.print("List after removing the" +
                " first Occurrence of \"10\" : ");

        // Printing the list
        System.out.println(list);
    }
}


