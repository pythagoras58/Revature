package userInput;

import java.util.Scanner;

public class ExampleThress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = "1 2 3 4 5";
        scanner = new Scanner(numbers);
        while (scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }
        scanner.close();
    }
}
