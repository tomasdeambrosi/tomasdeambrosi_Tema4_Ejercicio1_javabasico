package com.example;

public class SmartWatch extends SmartDevice{

    boolean submersible;

    public SmartWatch(){};

    public SmartWatch(String brand, int year, int ram, double storage, String operativeSystem, boolean bluetooth, int installedApps, boolean submersible) {
        super(brand, year, ram, storage, operativeSystem, bluetooth, installedApps);
        this.submersible = submersible;
    }

    public void setAlarm(int hour){
        if(hour>0&&hour<=24){
            System.out.println("Alarm set at " + hour);
        }else{
            System.out.println("Invalid hour");
        }
    }

}
