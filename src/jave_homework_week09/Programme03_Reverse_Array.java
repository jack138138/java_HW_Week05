package jave_homework_week09;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme03_Reverse_Array {
    public static void main(String[] args) {
        ArrayList J1 = new ArrayList();
        J1.add("1");
        J1.add("3");
        J1.add("4");
        J1.add("5");
        J1.add("6");
        J1.add("7");
        J1.add("8");
        J1.add("9");
        J1.add("10");
        J1.add("11");


        System.out.println("Number Before Reverse  :  " + J1);
        Collections.reverse(J1);
        System.out.println("Number After Reverse  :  "  + J1);

    }
}
