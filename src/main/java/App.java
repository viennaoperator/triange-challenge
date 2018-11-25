import com.tradeshift.triangle.Triangle;

import java.util.Scanner;

import static com.tradeshift.util.ConsoleUtil.GetUserInputAsFloat;

public class App {

    private static Triangle triangle;
    public static Scanner in;

    public static void main(String[] args) {
        Initialise();
        PrintHello();
        GetUserInput();
        PrintResult();
        Exit();
    }

    private static void Initialise() {
        in = new Scanner(System.in);
    }

    private static void PrintHello() {
        System.out.println("Welcome to the triangle app!");
        System.out.println("The application is going to tell you wheiter your triangle is equilateral, isoceles or scalene!");
        System.out.println("Please provide your 3 triangle lengths:");
    }

    public static void GetUserInput() {
        float lengthA = GetUserInputAsFloat("length a:", in);
        float lengthB = GetUserInputAsFloat("length b:", in);
        float lengthC = GetUserInputAsFloat("length c:", in);
        triangle = new Triangle(lengthA, lengthB, lengthC);
    }

    private static void PrintResult() {
        System.out.println("Your triangle is a " + triangle.getType().name());
    }

    private static void Exit() {
        System.out.println("Press key to exit!");
        in.next();
    }

}