package com.tradeshift.util;

import java.util.Scanner;

public class ConsoleUtil {

    public static float GetUserInputAsFloat(String message, Scanner in) {
        System.out.println(String.format("Please provide %s", message));
        float inputNumber = 0;
        while(inputNumber == 0) {
            inputNumber = ReadNumberFromConsole(in);
        }
        return inputNumber;
    }

    public static float ReadNumberFromConsole(Scanner in) {
        try {
            String input = in.nextLine();
            input = input.replace(",",".");
            float inputNumber = Float.parseFloat(input);
            if(inputNumber == 0 || inputNumber < 0) {
                System.out.println("Only positive numbers are allowed!");
                return 0;
            }
            return inputNumber;
        }
        catch(NumberFormatException e) {
            System.out.println("Only numbers are allowed!");
            return 0;
        }
    }
}