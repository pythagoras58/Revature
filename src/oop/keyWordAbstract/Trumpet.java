package oop.keyWordAbstract;

public class Trumpet extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("Say my name again");
    }

    public static void main(String[] args) {
        Trumpet trumpet = new Trumpet();

        trumpet.makeSound();
    }
}
