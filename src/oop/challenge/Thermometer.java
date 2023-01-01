package oop.challenge;

import java.util.Random;

public class Thermometer {
    /*
    * Thermometer should have one public method getTemperature()
    * that returns a random value between 0 (degrees Fahrenheit)
    * and 108 (degrees Fahrenheit).
     */

    int base = 0;
    int ceil = 108;

    Random r = new Random();

    public int getTemperature(){
        return r.nextInt(ceil - base);
    }
}
