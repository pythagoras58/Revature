package userInput;

import java.util.Scanner;

public class SecondChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A CHARACTER");
        String line = scanner.nextLine();
        moverFunc(line);
    }

    public static String moverFunc(String myInput){
        switch (myInput){
            case "1":
                System.out.println("Moving Right");
                break;
            case "2":
                System.out.println("Moving Left");
                break;
            case "3":
                System.out.println("Moving Up");
                break;
            case "4":
                System.out.println("Moving Down");
                break;
            case "q":
                System.exit(0);
                break;
            default:
                System.out.println("Try Again, Unacceptable Input");
                break;
        }
        return myInput;
    }
}
