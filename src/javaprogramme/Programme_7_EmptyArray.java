package javaprogramme;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not
 */
public class Programme_7_EmptyArray {
    public static void main(String[] args) {
        arrayList();

    }

    public static void arrayList() {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("Before Adding elements: ");
        // Check if the ArrayList is empty
        if (arrayList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
        System.out.println(); // consume line
        System.out.println("After Adding elements: ");
        // Add elements to the ArrayList
        arrayList.add("Item 1");
        arrayList.add("Item 2");

        // Check if the ArrayList is empty after adding elements
        if (arrayList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}