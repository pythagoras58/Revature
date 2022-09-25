package collections;

public class SwappingElements {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5};

        for(int i=0; i<=elements.length -1; i++){
            System.out.println("[ORIGINAL ARRAY]-->" + elements[i]);
        }


        int first_arrayElement = elements[0];
        int last_arrayElement = elements[4];


        elements[0] = last_arrayElement;
        elements[4] = first_arrayElement;

        for(int i=0; i<=elements.length -1; i++) {
            System.out.println("[MODIFIED ARRAY]--> " + elements[i]);
        }
    }
}
