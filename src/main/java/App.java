import com.tradeshift.triangle.Triangle;

import java.util.Scanner;

public class App {

    private static int lengthA;
    private static int lengthB;
    private static int lengthC;
    public static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Welcome to the triangle app!");
        System.out.println("The application is going to tell you wheiter your triangle is equilateral, isoceles or scalene!");
        System.out.println("Please provide your 3 triangle lengths:");
        GetUserInput();
        Triangle triangle = new Triangle(lengthA, lengthB, lengthC);
        System.out.println("Your triangle is a " + triangle.getType().name());
        in.nextLine();
    }

    public static void GetUserInput() {
        lengthA = GetUserInputAsInt("length a:");
        lengthB = GetUserInputAsInt("length b:");
        lengthC = GetUserInputAsInt("length c:");
    }

    public static int GetUserInputAsInt(String message) {
        System.out.println(String.format("Please provide %s", message));
        int inputNumber = 0;
        while(inputNumber == 0) {
            inputNumber = ReadNumberFromConsole();
        }
        return inputNumber;
    }

    public static int ReadNumberFromConsole() {
        try {
            String input = in.nextLine();
            int inputNumber = Integer.parseInt(input);
            if(inputNumber < 1) {
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