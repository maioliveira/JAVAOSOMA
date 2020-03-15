package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code her
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number2;
        int number3;

        System.out.println( "Put a number " );
            number2 = Integer.parseInt(reader.readLine());
                System.out.println( "You put " + number2);

        System.out.println( "Put another number " );
            number3 = Integer.parseInt(reader.readLine());
                System.out.println( "You put " + number3);

        System.out.println(number2 + number3);

    }
}
