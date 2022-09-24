package arithmetic;

public class Logics {
    public static void main(String[] args) {
        int a = 4;

        System.out.println("[PREFIX]-->" + ++a);
        System.out.println("[POSTFIX]-->" + a++);

//        (a >= 4) ? (a= 4) : (a = 4);

        System.out.println("========PROJECT===========");
        int x =5;
        int y = 3;
        int z;

        // instantiation
        Logics logics = new Logics();

        // simple addition
        z = logics.addition(x,y);
        System.out.println("[ADDITION]-->" + z);

        //simple subtraction
        z = logics.subtraction(x,y);
        System.out.println("[SUBTRACTION]-->" + z);

        //simple multiplication
        z = logics.multiplication(x,y);
        System.out.println("[MULTIPLICATION]-->" + z);

        //simple division
        z = logics.division(x,y);
        System.out.println("[DIVISION]-->" + z);

        //simple modulo
        z = logics.modulo(x,y);
        System.out.println("[MODULUS]-->" + z);

    }

    //addition
    private Integer addition(int a, int b){
        return a+b;
    }

    //subtraction
    private Integer subtraction(int a, int b){
        return a-b;
    }

    //multiplication
    private Integer multiplication(int a, int b){
        return a*b;
    }

    //division
    private Integer division(int a, int b){
        return a/b;
    }

    //modulo
    private Integer modulo(int a, int b){
        return a%b;
    }


}
