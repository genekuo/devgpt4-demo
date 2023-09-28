package com.example.api.controller;

import com.example.api.model.WeatherData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    // We use a List object as an in-memory database for the purpose of this
    // exercise.
    private List<WeatherData> weatherDataList = new ArrayList<>();

    public WeatherController() {
        // Adding default data
        weatherDataList.add(new WeatherData("London", 20.5, "Cloudy"));
        weatherDataList.add(new WeatherData("New York", 30.8, "Sunny"));
        weatherDataList.add(new WeatherData("Sydney", 25.0, "Rainy"));
    }

    @GetMapping
    public ResponseEntity<List<WeatherData>> getAllWeatherData() {
        return new ResponseEntity<>(weatherDataList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<WeatherData> addWeatherData(@RequestBody WeatherData newWeatherData) {
        // Assuming the newWeatherData object will be added to in-memory database here.
        weatherDataList.add(newWeatherData);
        // Return the newly added WeatherData object and HttpStatus.CREATED status.
        return new ResponseEntity<>(newWeatherData, HttpStatus.CREATED);
    }

}
