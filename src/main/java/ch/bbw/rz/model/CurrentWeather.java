package ch.bbw.rz.model;

public class CurrentWeather {
    private String country;
    private String city;
    private String lastUpdated;
    private String temperature;
    private String humidity;

    public CurrentWeather(String country, String city, String lastUpdated, String temprature, String humidity) {
        this.country = country;
        this.city = city;
        this.lastUpdated = lastUpdated;
        this.temperature = temprature;
        this.humidity = humidity;
    }

    public CurrentWeather(){

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
