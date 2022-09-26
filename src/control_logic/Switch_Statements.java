package control_logic;

public class Switch_Statements {
    public static void main(String[] args) {
        int num =7;

        switch (num){
            case 2:
                System.out.println("WRONG");
                break;

            case 7:
                System.out.println("[CORRECT]");
                break;

            default:
                System.out.println("[NOT QUITE]");
                break;
        }
    }
}
