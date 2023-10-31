package com.mustafabaser.javabootcamp.oop.using_interface;

public class MyClass implements MyInterface {
    @Override
    public void metod1() {
        System.out.println("Metod 1 çalıştı");

    }

    @Override
    public String metod2() {
        return "Metod 2 çalıştı";
    }
}
