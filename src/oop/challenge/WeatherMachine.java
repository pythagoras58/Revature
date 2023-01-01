package oop.challenge;

public class WeatherMachine {
    //Make a composite relationship
    Thermometer thermometer;

    /*
    WeatherMachine will have a composite relationship with
    Thermometer and itself record the temperature reported by Thermometer.
    It should have a private method getPastTemperatures()
    that returns an array of 24 temperatures (just create a loop to call getTemperature 24 times).
     */

    public WeatherMachine(){
        thermometer = new Thermometer();
    }


}
