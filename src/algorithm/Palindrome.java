package algorithm;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ENTER A PHRASE]\n");
        String phrase = scanner.next();

        var phraseLen = phrase.length();
        var c=0;

        if(phraseLen > 0){
            while (c <= phraseLen/2){
//                if(phrase[c] != phrase[phraseLen -1 -c]){
//                    System.out.println("PHRASE IS NOT PALINDROME");
//                    return;
//                }
                c = c + 1;
            }
            System.out.println("[PHRASE IS PALINDROME]");
            return;
        }else{
            System.out.println("[NOTHING WAS ENTERED]");
        }

        /*
        * let length = phrase.length
	let c = 0

	while (c <= length/2)
		if (phrase[c] != phrase[length - 1 - c])
			return false
		c = c + 1

	return true
        * */
    }
}
