package methods;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("[ENTER A WORD]");
        Scanner scanner = new Scanner(System.in);
        String textWord = scanner.next();

        var myMethod = new ExerciseOne().sayTextWord(textWord);

        System.out.println("[WORD WAS]->" + myMethod);

    }

    public String sayTextWord(String _textWord){
        return _textWord;
    }
}
