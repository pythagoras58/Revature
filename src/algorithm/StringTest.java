package algorithm;

public class StringTest {
    public static void main(String[] args) {
        String stringA = "Hello";
        String stringB = new String("Hello");

        System.out.println("String A" + stringA);
        System.out.println("String B" + stringB);

        if(stringA.equals(stringB)){
            System.out.println("Both are the same - content");
        } else if (stringA == stringB) {
            System.out.println("Both are the same - address");
        } else {
            System.out.println("Both are not the same");
        }
    }
}
