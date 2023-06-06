package jave_homework_week09;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme04_Colours_Array {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>();
        colour.add("Blue");
        colour.add("Red");
        colour.add("Silver");
        colour.add("White");
        colour.add("Black");
        colour.add("Golden");
        colour.add("Purple");
        colour.add("Green");
        colour.add("Orange");
        for (String a : colour){
            System.out.println(a);
        }


    }

}
