package javaprogramme;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given array list
 */

public class Programme_6_ArrayListIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Index number to retrieve: ");
        int indexToRetrieve = scanner.nextInt();
        Programme_6_ArrayListIndex obj = new Programme_6_ArrayListIndex();
        obj.setArrayList(indexToRetrieve);
        scanner.close();
    }

    public void setArrayList(int indexToRetrieve) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //Add element into arraylist
        arrayList.add(100);
        arrayList.add(300);
        arrayList.add(500);
        arrayList.add(700);
        arrayList.add(900);
        arrayList.add(1100);

        try {
            //use get method to retrieve the element at the specified index
            int element = arrayList.get(indexToRetrieve);
            System.out.println("Element at Index " + indexToRetrieve + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please choose valid index");
        }
    }
}
