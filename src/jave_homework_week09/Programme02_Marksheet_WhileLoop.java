package jave_homework_week09;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3 programmes) using if else and while loop.
 *A java program to input student name, roll no and three subjects maths, science and english marks ( marks between
 *  * 0 and 100 and if it's out of range then print the error message "Invalid Input, marks should be between 0 and 100")
 *  * and find the total, percentage and result.
 *  * if they are pass or fail on the basis of their percentage (pass>=35) and also give them grade if % >= 80 A+,
 *  * % >= 60 A, % >= 50 B, % >= 35 C and then print the mark sheet by using While Loop in the following format:
 *  * ---------------------------------------
 *  * |                                     |
 *  * |             Mark Sheet              |
 *  * |-------------------------------------|
 *  * |  Name      : Jay                    |
 *  * |  Roll No   : 08                     |
 *  * |-------------------------------------|
 *  * |  Subjects     :  Marks              |
 *  * |-------------------------------------|
 *  * |  Maths        :  98                 |
 *  * |  Science      :  90                 |
 *  * |  English      :  85                 |
 *  * |-------------------------------------|
 *  * |  Total        :  273                |
 *  * |-------------------------------------|
 *  * |  Percentage   :  91.0               |
 *  * |  Result       :  Pass               |
 *  * |  Grade        :  A+                 |
 *  * |-------------------------------------|
 */
public class Programme02_Marksheet_WhileLoop {

    static String Name;
    static int Roll, Maths, Science, English;
    static int Total;

    static double Percentage;

    static String Grade;
    static String Result;

    public static void main(String[] args) {

        Scanner J1 = new Scanner(System.in);
        System.out.println("Please enter Student Name: ");
        Name = J1.nextLine();
        System.out.println("Please enter Student Roll Number: ");
        Roll = J1.nextInt();
        System.out.println("Please enter Math Marks: ");
        //while loops ensure that the programme not forward until incorrect mark are entered
        Maths = J1.nextInt();
        while (Maths < 0 || Maths > 100) {
            System.out.println("Invalid Maths marks, marks between 0 to 100");
            System.out.println("Please enter Correct Maths marks: ");
            Maths = J1.nextInt();
        }
        System.out.println(" Please enter science marks : ");
        Science = J1.nextInt();
        while (Science < 0 || Science > 100) {
            System.out.println("Invalid Science marks, marks between 0 to 100");
            System.out.println("Please enter Correct Science marks: ");
            Science = J1.nextInt();
        }

        System.out.println(" Please enter science marks : ");
        English = J1.nextInt();
        while (English < 0 || English > 100) {
            System.out.println("Invalid English marks, marks between 0 to 100");
            System.out.println("Please enter Correct English marks: ");
            English = J1.nextInt();
        }


        if (Maths >= 0 && Maths <= 100 && Science >= 0 && Science <= 100 && English >= 0 && English <= 100) {

                result1();
                print();
            } else{
                System.out.println("The Marks value should be between 0 to 100");
            }
        J1.close();
        }
        public static void result1 () {
            Total = (Maths + English + Science);
            Percentage = (Total / 3);
            if ((Maths < 35)  || (Science < 35) ||  (English < 35)) {
                Percentage = (0.0);
                Result = ("Fail");
                Grade = ("N/A");
            } else if ((Percentage >= 35) && Percentage < 50) {
                Result = ("Pass");
                Grade = ("C");
            } else if ((Percentage >= 50) && Percentage < 60) {
                Result = ("Pass");
                Grade = ("B");
            } else if ((Percentage >= 60) && Percentage < 80) {
                Result = ("Pass");
                Grade = ("A");
            } else if (Percentage >= 80)  {
                Result = ("Pass");
                Grade = ("A++");



            }

        }


    // Print method calling all variables and printing desired output
    public static void print() {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + Name + "               |");
        System.out.println("| Roll No:" + Roll + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + Maths + "                   |");
        System.out.println("| Science:" + Science + "                |");
        System.out.println("| English:" + English + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + Total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + Percentage + "           |");
        System.out.println("| Result:" + Result + "               |");
        System.out.println("| Grade:" + Grade + "                   |");
        System.out.println("|___________________________|");
    }


}




        
