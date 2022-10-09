package methods;

public class ExerciseFive {
    public static void main(String[] args) {
        getAlphabetArray();
    }

    public static void getAlphabetArray(){
        char first = 'a';
        char last = 'z';

        do{
            System.out.println(first);
            first++;
        }while(first <= last);
    }
}
