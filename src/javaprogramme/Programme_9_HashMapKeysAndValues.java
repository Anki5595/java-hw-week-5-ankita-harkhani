package javaprogramme;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Programme_9_HashMapKeysAndValues {
    public static void main(String[] args) {
        Programme_9_HashMapKeysAndValues obj = new Programme_9_HashMapKeysAndValues();
        obj.People();

    }

    public void People() {

        Map<String, Integer> people = new HashMap<>(); // create HashMap to store string and integer value

        //add peoples data to the HashMap
        people.put("Anki", 29);
        people.put("Komal", 32);
        people.put("Chintan", 39);
        people.put("Hiren", 38);
        people.put("Himanshu", 41);
        people.put("Asha", 40);
        people.put("Disha", 42);
        people.put("Mahak", 37);

        //use for-each loop to iterate through the values in the map
        for (Integer age : people.values()){
            System.out.println("Age: " + age);
        }
    }
}
