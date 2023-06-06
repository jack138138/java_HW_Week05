package programme01_calculate;

public class Calculator {

    public void addition (int a, int b) {  //addition method
        int result = (a + b);
        System.out.println("The addition of " + a + " and " + b + " is " + result);

    }

    public void subtraction (int a, int b){   //subtraction method
        int result = (a-b);
        System.out.println( " The subtraction of" + a + " and " + b + "is " + result);

    }
    public void division (int a, int b){   //division method
        int result = (a/b);
        System.out.println("The division of " + a + " and " + b + " is " + result );

    }
    public void multiplication (int a, int b){ //multiplication method
        int result = (a*b);
        System.out.println("The multiplication of " + a + " and " + b + " is " + result );

    }

    public void calculateResult(int a, int b, char symbol){  //method to call other method
        if (symbol == '+')
            addition(a,b);
        else if (symbol == '-')
        subtraction(a,b);
        else if (symbol == '/')
        division(a,b);
        else if (symbol == '*')
        multiplication(a,b);

        else
            System.out.println(" Please enter  +, -, /, *");
    }

}
