package com.example.api.model;

import java.io.Serializable;

public class WeatherData implements Serializable {
    private String location;
    private double temperature;
    private String description;

    public WeatherData(String location, double temperature, String description) {
        this.location = location;
        this.temperature = temperature;
        this.description = description;
    }

    // getters and setters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTemperature() {
        return temperature;
    }

    public void seTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}