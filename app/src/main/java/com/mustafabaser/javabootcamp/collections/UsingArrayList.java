package com.mustafabaser.javabootcamp.collections;

import java.util.ArrayList;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<>();

        // Veri Ekleme
        meyveler.add("Muz"); //0.
        meyveler.add("Elma"); //1.
        meyveler.add("Kiraz"); //2.
        System.out.println("Meyveler : " + meyveler);

        // Update
        meyveler.set(1, "Yeni Elma"); // Index bazlı güncelleme
        System.out.println("Meyveler : " + meyveler);

        // Insert
        meyveler.add(1,"Portakal"); // 1. indexe Portakal değerini ekler, diğerlerini sağa kaydırır (index olarak)
        System.out.println("Meyveler : " + meyveler);

        // Read
        String meyveIndexBir = meyveler.get(1); // Parametre olarak index alır: 1. indexi okuduk
        System.out.println("Sonuç : " + meyveIndexBir);
        System.out.println("Boyut : " + meyveler.size());


        // Iterating

        // For each:
        for(String meyve:meyveler){
            System.out.println("Sonuç : " + meyve);
        }

        for(int i=0; i< meyveler.size(); i++){
            System.out.println(i + ". Index : " + meyveler.get(i));
        }

        // Remove
        meyveler.remove(2); // Index tabanlı silme işlemi
        System.out.println("Meyveler : " + meyveler);

        // Clear (Tamamını Temizleme)
        meyveler.clear();
        System.out.println("Meyveler : " + meyveler);
    }
}
