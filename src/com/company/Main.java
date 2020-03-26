package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            double sumResult = 0;
            double subtractionResult = 0;
            double multiplicationResult;
            double divisionResult;
            double restResult;
            double number1RestResult;
            double number2RestResult;
            int operação = 5;
            String nomeOperação;

            double[] numero = new double[2];
            int arraylength = numero.length;
            int contador = 0;
            while (contador < arraylength) {
                System.out.println("Write a number " + (contador + 1));
                numero[contador] = Double.parseDouble(reader.readLine());
                System.out.println("You wrote " + numero[contador]);
                sumResult = sumResult + numero[contador];
                subtractionResult = subtractionResult - numero[contador];

                contador = contador + 1;
            }

            System.out.println( "Escolha uma operação:");
            System.out.println( "0 = sair;");
            System.out.println( "1 = adição;");
            System.out.println( "2 = subtração;");
            System.out.println( "3 = multiplicação;");
            System.out.println( "4 = divisão;");

            operação = Integer.parseInt(reader.readLine());
            switch (operação) {
                case 0: System.out.println( "Você escolheu sair (0), até a próxima." );
                break;
                case 1: System.out.println( "Você escolheu adição (1)." );
                    int contador2 = 0;
                    System.out.print( "The result of " );
                    while (contador2 < arraylength) {
                        System.out.print(numero[contador2]);
                        contador2 = contador2 + 1;
                        if (contador2 < arraylength) {
                            System.out.print( " + ");
                        }
                    }
                    System.out.print( " is " + sumResult);
                    number1RestResult = numero[0] % 2;
                    number2RestResult = numero[1] % 2;
                break;
                case 2: System.out.println( "Você escolheu subtração (2)" );
                    int contador3 = 0;
                    System.out.print( "The result of " );
                    while (contador3 < arraylength) {
                        System.out.print(numero[contador3]);
                        contador3 = contador3 + 1;
                        if (contador3 < arraylength) {
                            System.out.print( " - ");
                        }
                    }
                    System.out.print( " is " + subtractionResult);
                    number1RestResult = numero[0] % 2;
                    number2RestResult = numero[1] % 2;
                break;
                case 3: System.out.println( "Você escolheu multiplicação (3)" );
                break;
                case 4: System.out.println( "Você escolheu divisão (4)" );
                break;


            }
        }
    }
// tirei lá de cima public static void main(String[] args) throws IOException {