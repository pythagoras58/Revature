package statements;

public class arrayComplex {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10};
        int[] arr2 = {1,3,5,7,9};

        for(int i=0; i< arr1.length; i++){
            for(int j=0; j< arr2.length; j++){
                System.out.println("[VALUES] " + arr1[i] + " AND " + arr2[j] + " is " + arr1[i] * arr2[j]);
            }
        }
    }
}
