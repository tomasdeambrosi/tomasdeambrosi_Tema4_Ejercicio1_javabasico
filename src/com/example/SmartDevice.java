package com.example;

public abstract class SmartDevice {

    String brand;
    int year;
    int ram;
    double storage;
    String operativeSystem;
    boolean bluetooth;
    int installedApps;

    public SmartDevice(){};

    public SmartDevice(String brand, int year, int ram, double storage, String operativeSystem, boolean bluetooth, int installedApps) {
        this.brand = brand;
        this.year = year;
        this.ram = ram;
        this.storage = storage;
        this.operativeSystem = operativeSystem;
        this.bluetooth = bluetooth;
        this.installedApps = installedApps;
    }

    public void installApp(){
        this.installedApps += 1;
        System.out.println("App installed successfully");
    }
}











