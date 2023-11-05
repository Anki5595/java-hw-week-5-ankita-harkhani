package javaprogramme;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using Iterator.
 */

public class Programme_5_ArrayListIterator {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("White");
        arrayList.add("Black");
        arrayList.add("Pink");
        arrayList.add("Red");
        arrayList.add("Blue");
        arrayList.add("Purple");

        // Create an Iterator for the ArrayList

        Iterator iterator = arrayList.iterator();
        // Iterate through the elements using the Iterator
        while(iterator.hasNext()){
        String element = iterator.next().toString();
            System.out.print(element +", " + " ");
        }
    }
}
