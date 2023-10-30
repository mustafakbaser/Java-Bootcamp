package com.mustafabaser.javabootcamp.collections;

import java.util.HashMap;
import java.util.Set;

public class UsingHashMap {
    public static void main(String[] args) {
        // HashMap : Swift(Dictionary)
        // JSON alt yapısı HashMap'tir.
        // Object: Superclassların en üstüdür, bütün classlar object'den oluşmaktadır. Kotlin & Swift: (Any)

        HashMap<Integer, String> iller = new HashMap<>();

        // Veri Ekleme (Key, Value):
        iller.put(35,"Izmir");
        iller.put(34, "Istanbul");
        iller.put(06, "Ankara");
        System.out.println("İller: " + iller);

        // Update (Var olan verinin üstüne yazmak)
        iller.put(35, "Smyrna");
        System.out.println("İller: " + iller);

        // Veri Okuma
        String il = iller.get(34);
        System.out.println("İl: " + il);

        System.out.println("Boyut: " + iller.size());

        // keySet();
        Set<Integer> anahtarlar = iller.keySet();

        for (Integer anahtar:anahtarlar){
            System.out.println("Plaka: " + anahtar + " - " + iller.get(anahtar));
        }

        // Kaldırmak : .remove();
        iller.remove(35);
        System.out.println(iller);

        // Tümünü Silmek : .clear();
        iller.clear();
        System.out.println(iller);
    }
}
