package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sumResult = 0;
        double subtractionResult;
        double multiplicationResult;
        double divisionResult;
        double restResult;
        double number1RestResult;
        double number2RestResult;

        double[] arrayteste = new double[10];
        int arraylength = arrayteste.length;
        int contador = 0;
        while (contador < arraylength) {
            System.out.println( "Write a number " + (contador+1));
            arrayteste[contador] = Double.parseDouble(reader.readLine());
            System.out.println( "You put " + arrayteste[contador]);
            sumResult = sumResult + arrayteste[contador];

            contador = contador + 1;
        }
        int contador2 = 0;
        System.out.print( "The result of " );
        while (contador2 < arraylength) {
            System.out.print(arrayteste[contador2] + " + " );
            contador2 = contador2 + 1;
            
        }
        System.out.print( "is " + sumResult);
        number1RestResult = arrayteste[0] % 2;
        number2RestResult = arrayteste[1] % 2;



        /*
        subtractionResult = number1 - number2;
        System.out.println("The result of " + number1 + " - " + number2 + " is " + subtractionResult);

        multiplicationResult = number1 * number2;
        System.out.println("The result of " + number1 + " x " + number2 + " is " + multiplicationResult);

        divisionResult = number1 / number2;
        System.out.println("The result of " + number1 + " ÷ " + number2 + " is " + divisionResult);

        restResult = number1 % number2;
        System.out.println("The result of " + number1 + " % " + number2 + " is " + restResult);

        if (number1 > number2) {
            System.out.println("First number " + number1 + " is greater than second number " + number2);
        } else if (number1 < number2) {
            System.out.println("Second number " + number2 + " is greater than first number " + number1);
        } else {
            System.out.println("The first number is the same as the second.");
        }

        if (number1RestResult == 0) {
            System.out.println(number1 + " is even.");
        } else {
            System.out.println(number1 + " is odd.");
        }
        if (number2RestResult != 0) {
            System.out.println(number2 + " is odd.");
        } else {
            System.out.println(number2 + " is even.");
        }*/
    }
}
