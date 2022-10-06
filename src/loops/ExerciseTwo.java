package loops;

/*
* For this exercise, you must write a while loop
* that prints all of the even numbers 100 to -100, i
* nclusively, each on a separate line
* */

public class ExerciseTwo {
    public static void main(String[] args) {
        int number = -100;

        while (number <=100){
            if(number % 2 == 0){
                System.out.println(number);
            }
            number++;
        }
    }
}
