package com.Sanketh.WeatherApp.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {

    private Current current;

    public Current getCurrent() { return current; }
    public void setCurrent(Current current) { this.current = current; }

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

        public double getTempC() { return tempC; }
        public void setTempC(double tempC) { this.tempC = tempC; }

        public int getHumidity() { return humidity; }
        public void setHumidity(int humidity) { this.humidity = humidity; }

        public double getWindKph() { return windKph; }
        public void setWindKph(double windKph) { this.windKph = windKph; }

        public String getWindDir() { return windDir; }
        public void setWindDir(String windDir) { this.windDir = windDir; }

        public AirQuality getAirQuality() { return airQuality; }
        public void setAirQuality(AirQuality airQuality) { this.airQuality = airQuality; }
    }

    public static class AirQuality {

        @JsonProperty("us-epa-index")
        private int usEpaIndex;

        public int getUsEpaIndex() { return usEpaIndex; }
        public void setUsEpaIndex(int usEpaIndex) { this.usEpaIndex = usEpaIndex; }
    }
}
