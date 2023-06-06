package jave_homework_week09;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 /**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme05_Iterate_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Avocado");
        fruit.add("Apple");
        fruit.add("Cherry");
        fruit.add("BlueBerry");
        fruit.add("Pineapple");
        fruit.add("Kiwi");
        fruit.add("Mango");

        ListIterator<String> iterator = fruit.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ",");


        }
    }

}
