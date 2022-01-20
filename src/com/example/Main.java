package com.example;

public class Main {

    public static void main(String[] args) {

        SmartPhone samsungGalaxy = new SmartPhone("Samsung", 2020, 8, 32.6, "Android", true, 3, 2, true);
        System.out.println(samsungGalaxy.brand);
        System.out.println(samsungGalaxy.year);
        System.out.println(samsungGalaxy.ram);
        System.out.println(samsungGalaxy.storage);
        System.out.println(samsungGalaxy.operativeSystem);
        System.out.println(samsungGalaxy.bluetooth);
        System.out.println(samsungGalaxy.cameraQuantity);
        System.out.println(samsungGalaxy.touchScreen);

        System.out.println(samsungGalaxy.installedApps);
        samsungGalaxy.installApp();
        System.out.println(samsungGalaxy.installedApps);


        SmartWatch macWatch = new SmartWatch("mac",2022, 4, 2, "MAC OS", true, 2, true);
        System.out.println(macWatch.brand);
        System.out.println(macWatch.year);
        System.out.println(macWatch.ram);
        System.out.println(macWatch.storage);
        System.out.println(macWatch.operativeSystem);
        System.out.println(macWatch.bluetooth);
        System.out.println(macWatch.submersible);


        System.out.println(macWatch.installedApps);
        macWatch.installApp();
        System.out.println(macWatch.installedApps);

        macWatch.setAlarm(22);
        macWatch.setAlarm(45);
        macWatch.setAlarm(1);
        macWatch.setAlarm(0);




    }
}
