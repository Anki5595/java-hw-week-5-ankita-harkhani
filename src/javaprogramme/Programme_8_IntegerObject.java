package javaprogramme;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else
 */
public class Programme_8_IntegerObject {
    public static void main(String[] args) {
        Programme_8_IntegerObject obj = new Programme_8_IntegerObject();
        obj.integerObject();
    }

    public void integerObject(){
        //HashSet creation to store Integer Object
        HashSet<Integer> numberSet = new HashSet<>();

        //store the number 4,7 and 8 in the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        //For loop to check the number is between 1 and 10 are in the test
        for (int i = 1; i<=10; i++){
            if (numberSet.contains(i)){
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }


}
