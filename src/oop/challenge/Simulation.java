package oop.challenge;

public class Simulation {
    /*
    The Simulation class should only declare a main method.
    Inside of main you should create an instance of
    WeatherMachine and call the getWeatherReport() method from it
     */
    public static void main(String[] args) {
        WeatherMachine weatherMachine = new WeatherMachine();
        weatherMachine.getWeatherReport();
    }
}
