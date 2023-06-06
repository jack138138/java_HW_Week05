package jave_homework_week09;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */

public class Programme07_EmptyArrayList {

    public static void main(String[] args) {
        //create a empty ArrayList
        ArrayList<String> car = new ArrayList<>();
        //Add elements to the ArrayList
        PrintEmptyCheck(car);
        car.add("Maruti");
        car.add("Audi");
        car.add("Honda");
        car.add("Merc");
        car.add("Jazz");
        car.add("Ferrari");
        car.add("Hyundai");
        // Display the list
        System.out.println("Arraylist" + car);
        // calling static method
        PrintEmptyCheck(car);
    }
    //...

static void PrintEmptyCheck(ArrayList car){
        if(car.isEmpty())
            System.out.println("The ArrayList is Emplty");
        else
            System.out.println("The ArrayList is not Empty");
}


}
