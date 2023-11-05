package javaprogramme;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme_4_ColourList {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("White");
        colourList.add("Red");
        colourList.add("Pink");
        colourList.add("Black");
        colourList.add("Purple");
        colourList.add("Blue");
        colourList.add("Brown");
        colourList.add("Cream");
        colourList.add("Green");

        // Print out the collection using a for-each loop
        System.out.println("Colors in the ArrayList:");
        for (String colour : colourList){
            System.out.print(colour + "," + " ");
        }
    }
}
