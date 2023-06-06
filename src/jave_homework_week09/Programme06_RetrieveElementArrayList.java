package jave_homework_week09;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */

public class Programme06_RetrieveElementArrayList {

    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Black");
        colours.add("Red");
        colours.add("Purple");
        colours.add("White");
        colours.add("Green");
        colours.add("Silver");
        colours.add("Golden");
        colours.add("Yellow");
        System.out.println(colours + "\n");
        System.out.println(colours.get(3));

    }
}
