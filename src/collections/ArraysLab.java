package collections;

public class ArraysLab {
    public static void main(String[] args) {
        int[] newArray = {1,2,3,4,3,5,6,4};

        // access the values with index
        System.out.println("[FIRST VALUE]-->" + newArray[0]);
        System.out.println("[LAST VALUE]-->" + newArray[7]);

        // printing every element in the array
        for(int i=0; i <= newArray.length -1; i++){
            System.out.println("[ARRAY ELEMENTS]-->" + newArray[i]);
        }
    }
}
