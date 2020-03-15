package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code her
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1;
        int number2;
        int result1;
        int result2;
        int result3;
        double result4;
        double result5;
        //double teste1;

        System.out.println( "Put a number " );
            number1 = Integer.parseInt(reader.readLine());
                System.out.println( "You put " + number1);

        System.out.println( "Put another number " );
            number2 = Integer.parseInt(reader.readLine());
                System.out.println( "You put " + number2);

        result1 = number1 + number2;
        System.out.println("The result of " + number1 + " + " + number2 + " is " + result1);

        result2 = number1 - number2;
        System.out.println("The result of " + number1 + " - " + number2 + " is " + result2);

        result3 = number1 * number2;
        System.out.println("The result of " + number1 + " x " + number2 + " is " + result3);

        result4 = number1 / number2;
        System.out.println("The result of " + number1 + " ÷ " + number2 + " is " + result4);

        result5 = number1 % number2;
        System.out.println("The result of " + number1 + " % " + number2 + " is " + result5);

        //teste1 = 0.5;

        //System.out.println(teste1);

        //System.out.println("The result of " + number1 + " + " + number2 + " is " + (number1 + number2));
        //System.out.println("The result of " + number1 + " - " + number2 + " is " + (number1 - number2));
        //System.out.println("The result of " + number1 + " x " + number2 + " is " + (number1 * number2));
        //System.out.println("The result of " + number1 + " ÷ " + number2 + " is " + (number1 / number2));

    }
}
