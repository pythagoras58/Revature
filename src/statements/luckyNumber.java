package statements;

import java.util.Scanner;

public class luckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int luckNumber = scanner.nextInt();

        if(luckNumber < 10){
            if(luckNumber == 5){
                System.out.println("CONGRATULATION! LUCKY NUMBER FINE");
            }else{
                System.out.println("NOT CLOSE");
            }
        }else {
            System.out.println("NOT EVEN CLOSE");
        }
    }
}
