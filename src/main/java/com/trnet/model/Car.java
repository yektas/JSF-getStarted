package com.trnet.model;

public class Car {

    private String brand;
    private int count;

    public Car(String brand, int count) {
        this.brand = brand;
        this.count = count;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
