package statements;

public class nestedStatement {
    public static void main(String[] args) {
        int counter = 1;
        int endVal = 10;

        for(int i=counter; i <=endVal; i++){
            if(i == 5){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
