package com.Sanketh.WeatherApp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {

    private Current current;

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }


    public static class Current {

        private int temperature;

        private int humidity;

        @JsonProperty("wind_speed")
        private int windSpeed;

        @JsonProperty("wind_dir")
        private String windDirection;

        private Astro astro;

        @JsonProperty("air_quality")
        private AirQuality airQuality;

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(int windSpeed) {
            this.windSpeed = windSpeed;
        }

        public String getWindDirection() {
            return windDirection;
        }

        public void setWindDirection(String windDirection) {
            this.windDirection = windDirection;
        }

        public Astro getAstro() {
            return astro;
        }

        public void setAstro(Astro astro) {
            this.astro = astro;
        }

        public AirQuality getAirQuality() {
            return airQuality;
        }

        public void setAirQuality(AirQuality airQuality) {
            this.airQuality = airQuality;
        }
    }


    public static class Astro {

        private String sunrise;
        private String sunset;

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }
    }


    public static class AirQuality {

        @JsonProperty("us-epa-index")
        private int usEpaIndex;

        public int getUsEpaIndex() {
            return usEpaIndex;
        }

        public void setUsEpaIndex(int usEpaIndex) {
            this.usEpaIndex = usEpaIndex;
        }
    }
}
