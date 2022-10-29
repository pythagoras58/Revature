package userInput;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER SOMETHING");
        String line = scanner.nextLine();
        int count = 0;

        for(int i=0; i<line.length(); i++){
            char letter = line.charAt(i);
            if(isVowel(letter)){
                count++;
            }
        }
        System.out.println("THE NUMBER OF VOWELS: " + count);
        scanner.close();
    }

    public static boolean isVowel(char letter){
        if(letter == 'a'|| letter =='e'||  letter =='i' || letter =='o' || letter =='u'){
            return true;
        }else{
            return false;
        }
    }
}
