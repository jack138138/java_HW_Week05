package jave_homework_week09;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme08_HashSet {
    public static void main(String[] args) {
        //Create a HAshset object called numbers
        HashSet<Integer> Num = new HashSet<>();


        // Add values to the set

        Num.add(2);
        Num.add(5);
        Num.add(7);
        Num.add(9);
        Num.add(3);
        Num.add(1);


        // show which number between 1 and 10 are in the set
        for (int i=1; i <=10; i++){
            if (Num.contains(i)) {
                System.out.println(i + "Number found");
            } else{
                System.out.println(i + " number not found");
            }
        }

    }




}
