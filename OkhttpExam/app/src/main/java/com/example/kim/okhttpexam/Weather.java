package com.example.kim.okhttpexam;

public class Weather {
    private String baseDate;
    private String baseTime;
    private String category;
    private String nx;
    private String ny;
    private String obsrValue;

    public Weather(String baseDate, String baseTime, String category, String nx, String ny, String obsrValue) {
        this.baseDate = baseDate;
        this.baseTime = baseTime;
        this.category = category;
        this.nx = nx;
        this.ny = ny;
        this.obsrValue = obsrValue;
    }

    public String getBaseDate() {
        return baseDate;
    }

    public void setBaseDate(String baseDate) {
        this.baseDate = baseDate;
    }

    public String getBaseTime() {
        return baseTime;
    }

    public void setBaseTime(String baseTime) {
        this.baseTime = baseTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNx() {
        return nx;
    }

    public void setNx(String nx) {
        this.nx = nx;
    }

    public String getNy() {
        return ny;
    }

    public void setNy(String ny) {
        this.ny = ny;
    }

    public String getObsrValue() {
        return obsrValue;
    }

    public void setObsrValue(String obsrValue) {
        this.obsrValue = obsrValue;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "baseDate='" + baseDate + '\'' +
                ", baseTime='" + baseTime + '\'' +
                ", category='" + category + '\'' +
                ", nx='" + nx + '\'' +
                ", ny='" + ny + '\'' +
                ", obsrValue='" + obsrValue + '\'' +
                '}';
    }
}