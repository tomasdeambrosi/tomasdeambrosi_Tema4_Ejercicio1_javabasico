package com.example;

public class SmartPhone extends SmartDevice {

    int cameraQuantity;
    boolean touchScreen;

    public SmartPhone(){};

    public SmartPhone(String brand, int year, int ram, double storage, String operativeSystem, boolean bluetooth, int installedApps, int cameraQuantity, boolean touchScreen) {
        super(brand, year, ram, storage, operativeSystem, bluetooth, installedApps);
        this.cameraQuantity = cameraQuantity;
        this.touchScreen = touchScreen;
    }
}
