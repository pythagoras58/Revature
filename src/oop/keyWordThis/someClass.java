package oop.keyWordThis;

public class someClass {
    long id;

    public someClass(){
        //this acting as a method
        this(2012);
        System.out.println("Default constructor");
    }

    public someClass(long id){
        // this acting as the current object finder
        this.id = id;

        System.out.println("Parameterized constructor");
    }
}
