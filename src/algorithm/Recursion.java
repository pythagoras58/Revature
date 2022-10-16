package algorithm;

public class Recursion {
    public static void main(String[] args) {
        int input = 5;

        System.out.println(factorial(input));

    }

    public static int factorial(int num){
        if(num <= 0)
            return 0;
        if(num == 1)
            return 1;
        return num * factorial(num);

    }
}
