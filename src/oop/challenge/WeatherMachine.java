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

    public String city = "Koforidua";

    public WeatherMachine(){
        thermometer = new Thermometer();
    }

    public WeatherMachine(String city){
        this.city = city;
    }

    private double[] getPastTemperatures(){
        double[] result = new double[24];

        for(int i = 0; i < result.length; i++) {
            result[i] = thermometer.getTemperature();
        }

        return result;
    }

    public void getWeatherReport() {
        System.out.println("Your last 24 hours:");
        double[] temps = getPastTemperatures();

        for(int i = 0; i < temps.length; i++) {
            System.out.println("Current Location ->" + city);
            System.out.println(i + ":00 " + temps[i] + " degrees");
        }
    }

}
