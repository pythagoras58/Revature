package statements;

import java.util.Scanner;

public class rainChances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ENTER RAIN CHANCE VALUE]");
        int rainChance = scanner.nextInt();

        int waterOutput = 0;

        if(rainChance<20){
            waterOutput = 30;
        } 
        else if (rainChance < 30) {
            waterOutput = 10;
        } else if (rainChance < 56) {
            waterOutput = 0;
        } else if (rainChance <= 100) {
            waterOutput = 0;
        }
        System.out.println("[WATER OUTPUT]-->" + waterOutput);
    }
}
