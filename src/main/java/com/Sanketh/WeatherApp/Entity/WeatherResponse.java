package com.Sanketh.WeatherApp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {

    private Current current;
    private Forecast forecast;

    public Current getCurrent() { return current; }
    public void setCurrent(Current current) { this.current = current; }

    public Forecast getForecast() { return forecast; }
    public void setForecast(Forecast forecast) { this.forecast = forecast; }

    public static class Current {

        @JsonProperty("temp_c")
        private double tempC;

        private int humidity;

        @JsonProperty("wind_kph")
        private double windKph;

        @JsonProperty("wind_dir")
        private String windDir;

        @JsonProperty("air_quality")
        private AirQuality airQuality;

        // getters and setters
    }

    public static class Forecast {
        private List<ForecastDay> forecastday;

        // getters and setters
    }

    public static class ForecastDay {
        private Astro astro;

        // getters and setters
    }

    public static class Astro {
        private String sunrise;
        private String sunset;
        // getters and setters
    }

    public static class AirQuality {
        @JsonProperty("us-epa-index")
        private int usEpaIndex;
        // getters and setters
    }
}
