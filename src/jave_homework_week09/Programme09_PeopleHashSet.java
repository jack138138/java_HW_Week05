package jave_homework_week09;

import java.util.HashMap;
import java.util.Map;

/**
 *Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 *
 */

public class Programme09_PeopleHashSet {
    public static void main(String[] args) {

        //Create Hashmap object
        HashMap<String,Integer> people = new HashMap<>();

        //add keys and values (name age)
        people.put("Jaydeep", 36);
        people.put("Komal", 42);
        people.put("Jasmeen", 40);
        people.put("Aarti", 42);
        people.put("Mukesh", 46);
        people.put("Riya", 30);
        people.put("Sharvat", 35);

        // Iterating hashmap through for loop
        for (Map.Entry<String, Integer> set : people.entrySet()){
            //printing all element of a map
            System.out.println(set.getKey() + " = " + set.getValue() );
        }



    }



}
