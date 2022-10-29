package userInput;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER SOMETHING");
        String line = scanner.nextLine();
        System.out.println("YOU ENTERED : " + line);
    }
}
