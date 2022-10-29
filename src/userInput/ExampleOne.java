package userInput;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String results = "";
        System.out.println("ENTER A STRING");
        results = scanner.nextLine();
        scanner.close();
        System.out.println("RESULT: " + results);
    }
}
