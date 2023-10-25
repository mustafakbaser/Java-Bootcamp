package com.mustafabaser.javabootcamp.oop;

public class FunctionsTestDrive {
    public static void main(String[] args) {
        Functions functions = new Functions();
        functions.selamla1();

        // Return Function
        String gelenSonuc = functions.selamla2();
        System.out.println("Gelen Sonuç : " + gelenSonuc);

        // Parametreli Function
        functions.selamla3("Kürşad");

        functions.carp(10,5,"Kürşad");
    }
}
