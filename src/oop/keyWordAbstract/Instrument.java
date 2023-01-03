package oop.keyWordAbstract;

public abstract class Instrument {
    private String brand;
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void makeSound();
}
