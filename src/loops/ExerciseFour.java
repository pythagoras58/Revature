package loops;

public class ExerciseFour {
    public static void main(String[] args) {
        char alphabet = 'a';
        char lastAlphabet = 'z';

        do{
            System.out.println(alphabet);
            alphabet++;
        }while (alphabet <= lastAlphabet);
    }
}

/*
* For this exercise, you must write a do-while loop that prints the letters of the alphabet.
* You must use a single char variable that you manipulate to print to the console.
* (You shouldn’t have 26 lines of code that each print a letter...)
* */
