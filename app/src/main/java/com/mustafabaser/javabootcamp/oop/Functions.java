package com.mustafabaser.javabootcamp.oop;

public class Functions {
    // Void : geri dönüş değeri olmayan
    public void selamla1(){
        String sonuc = "Merhaba Kürşad";
        System.out.println(sonuc);
    }

    // Return : geri dönüş değeri olanlar
    public String selamla2(){
        String sonuc = "Merhaba Kürşad";
        return sonuc;
    }

    // Parametre
    public void selamla3(String isim){
        String sonuc = "Merhaba " + isim;
        System.out.println(sonuc);
    }

    // Overloading (Aynı class içerisinde aynı fonksiyonu farklı türlerde kullanmak için):
    public void carp(int sayi1, int sayi2){
        System.out.println("Çarpma Sonucu : " + (sayi1 * sayi2));
    }

    public void carp(int sayi1, int sayi2, String isim){
        System.out.println("Çarpma Sonucu : " + (sayi1 * sayi2) + " - İşlemi Yapan Kişi : " + isim);
    }
}
