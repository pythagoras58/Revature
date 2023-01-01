package oop.composite;

public class ClassB {
    // make a composite relationship
    ClassA A = new ClassA();

    public static void main(String[] args) {
        ClassB B = new ClassB();
        B.A.setName("Anne Marie");
        System.out.println(B.A.getName());
    }
}
