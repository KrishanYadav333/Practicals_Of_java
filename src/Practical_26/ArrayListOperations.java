package Practical_26;

//26. Write programsto implement add,search and remove operation on ArrayList object.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Adding elements to the ArrayList
        arrayList.add("John");
        arrayList.add("Alice");
        arrayList.add("Bob");

        System.out.println("Initial List: " + arrayList);

        // Searching an element
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        if (arrayList.contains(name)) {
            System.out.println(name + " found in the list.");
        } else {
            System.out.println(name + " not found in the list.");
        }

        // Removing an element
        System.out.print("Enter name to remove: ");
        String removeName = sc.nextLine();
        if (arrayList.remove(removeName)) {
            System.out.println(removeName + " was removed from the list.");
        } else {
            System.out.println(removeName + " was not found in the list.");
        }

        // Display final list
        System.out.println("Final List: " + arrayList);
    }
}
