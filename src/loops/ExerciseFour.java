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
