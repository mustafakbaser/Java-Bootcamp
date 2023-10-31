package com.mustafabaser.javabootcamp.collections;

import java.util.HashSet;

public class UsingHashSet {
    public static void main(String[] args) {
        HashSet<String> meyveler = new HashSet<>();

        // Veri Ekleme
        meyveler.add("Muz");
        meyveler.add("Elma");
        meyveler.add("Kiraz");
        System.out.println("Meyveler: " + meyveler);

        meyveler.add("Elma"); // Elma zaten varolduğu için tekrar eklemeyecek. HashSet'in özelliği
        System.out.println(meyveler); // [Muz, Elma, Kiraz]

        // Hazır bir okuma fonksiyonu yer almıyor, döngülerle alınabilir.
        for(String meyve:meyveler){
            System.out.println("Sonuç : " + meyve);
        }

        meyveler.remove("Muz");
        System.out.println("Meyveler: " + meyveler); // Meyveler: [Elma, Kiraz]

        // .containts() (İçeriyor Mu?)
        System.out.println("İçeriyor mu: " + meyveler.contains("Kiraz"));

        meyveler.clear();
        System.out.println("Meyveler: " + meyveler); // Meyveler: []
    }
}
