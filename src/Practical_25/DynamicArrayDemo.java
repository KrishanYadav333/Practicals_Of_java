package Practical_25;

//25. write a program to create dynamic array using ArrayList class and the print the contents of the array object.

import java.util.ArrayList;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Adding elements to the dynamic array
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        // Printing elements of the dynamic array
        System.out.println("Contents of the dynamic array:");
        for (int element : dynamicArray) {
            System.out.println(element);
        }
    }
}

