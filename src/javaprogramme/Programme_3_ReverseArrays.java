package javaprogramme;

import java.util.Arrays;

/**
 * 3. Write a Java program to reverse an array of integer values
 */

public class Programme_3_ReverseArrays {
    public static void main(String[] args) {
        int[] originalArray = {100, 200, 300, 400, 500, 600};
        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println();

        // call the method to reverse array
        reverseArray(originalArray);

        System.out.print("Reversed Array: ");
        for (int number : originalArray) {
            System.out.print(number + "," + " ");
        }
    }
    public static void reverseArray(int[] array) {
        int start = 0; // initialize the start index
        int end = array.length - 1; // initialize the end index

        while (start < end) {
            //swap elements at start and end
            int reverse = array[start];
            array[start] = array[end];
            array[end] = reverse;

            //move the pointers towards each other
            start++;
            end--;
        }
    }
}
