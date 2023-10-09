package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        int number;
        int[] factors = {};
        // accept the number from the user
        Scanner scan = new Scanner(System.in);

        System.out.println("====KIndly Input A Number ====");
        number = scan.nextInt();

        for(int i=1; i<= number; i++){
            // If number is divided by i :: i becomes the factor

            if(number % i == 0){

                System.out.println("The factors of :" + number + " is: " + i);
            }
        }
    }
}
