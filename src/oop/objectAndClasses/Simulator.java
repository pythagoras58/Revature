package oop.objectAndClasses;

public class Simulator {

    public static void main(String[] args) {

        // instantiate the Gadget class
        Gadget gadget = new Gadget();
        Gadget gadget1 = new Gadget();  

        System.out.println("Serial Number of Gadget 1 -->" + gadget.serialNumber);
        System.out.println("Serial Number of Gadget 2 -->" + gadget1.serialNumber);
    }
}
