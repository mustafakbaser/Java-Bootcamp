package com.mustafabaser.javabootcamp.oop;

public class CarTestDrive {
    public static void main(String[] args) {
        // Object oluşturma
        Car bmw = new Car("BMW 520", "Siyah", 240, 0,false);
        /*
        // Değer atama
        bmw.model = "BMW 520";
        bmw.renk = "Siyah";
        bmw.hizLimiti = 240;
        bmw.calisiyorMu = false;
        bmw.anlikHiz = 0;*/

        // Değer okuma
        bmw.bilgiAl();
        bmw.calistir();
        bmw.bilgiAl();
        //bmw.durdur();
        //bmw.bilgiAl();
        bmw.hizlan(25);
        bmw.bilgiAl();
        bmw.yavasla(10);
        bmw.bilgiAl();

        // Object oluşturma
        Car tesla = new Car("Tesla A", "Beyaz", 180, 0,false);
        /*
        // Değer atama
        tesla.model = "Tesla A";
        tesla.renk = "Beyaz";
        tesla.hizLimiti = 180;
        tesla.calisiyorMu = false;
        tesla.anlikHiz = 0;
        */

        // Değer okuma
        tesla.bilgiAl();
        tesla.calistir();
        tesla.bilgiAl();
    }
}
