package methods;

public class ExerciseSix {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 3;
        int d = 1;
        var display = new ExerciseSix().squred(a,b,c,d);

        for(int i=0; i < display.length; i++) {
            System.out.println(display[i]);
        }
    }

    public double[] squred(int _one, int _two, int _three, int _four){
        double[] res = {_one*_one, _two*_two, _three*_three, _four*_four};
        return res;
    }
}
