package methods;

public class ExerciseSix {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 3;
        int d = 1;
        var display = new ExerciseSix().squred(a,b,c,d);
        System.out.println(display);
    }

    public double[] squred(int _one, int _two, int _three, int _four){
        double[] res = {_one*_one, _two*_two, _three*_three, _four*_four};
        return res;
    }
}
