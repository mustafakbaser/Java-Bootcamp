package com.mustafabaser.javabootcamp.degiskenler;

public class DegiskenOlusturma {
    public static void main(String[] args) {
        // String (Referans tip)
        String ogrenciAdi = "Kürşad";
        // Primitive (ilkel) Tipler, Küçük Harfle Başlıyor:
        int ogrenciYas = 27;
        double ogrenciBoy = 1.89;
        char ogrenciBasHarf = 'K';
        boolean ogrenciDevamEdiyorMu = true;

        System.out.println("Öğrenci Adı: " + ogrenciAdi);
        System.out.println("Öğrenci Yaş: " + ogrenciYas);
        System.out.println("Öğrenci Boy: " + ogrenciBoy);
        System.out.println("Öğrenci Baş Harf: " + ogrenciBasHarf);
        System.out.println("Öğrenci Devam Ediyor Mu: " + ogrenciDevamEdiyorMu);

        int urun_id = 3416;
        String urun_adi = "Kol Saati";
        int urun_adet = 100;
        double urun_fiyat = 149.99;
        String urun_tedarikci = "Rolex";

        System.out.println("Ürün ID: " + urun_id);
        System.out.println("Ürün Adı: " + urun_adi);
        System.out.println("Ürün Adet: " + urun_adet);
        System.out.println("Ürün Fiyat: " + urun_fiyat + "$");
        System.out.println("Tedarikçi: " + urun_tedarikci);

        // Sabit : Constant
        // final (java), let (swift) , val (kotlin), dart (final-const)

        int sayi = 5;
        System.out.println(sayi); // 5
        sayi = 50;
        System.out.println(sayi); // 50

        final int number = 10;
        System.out.println(number); // 10
        // number = 11; // Sabit değişmez


        /*
         Tür Dönüşümü (Type Casting):

          1. Sayısaldan Sayısala
          2. Sayısaldan Metne
          3. Metinden Sayısala
        */


        // 1. Sayısaldan Sayısala

        int i = 51;
        double d = 22.53;

        int sonuc1 = (int) d; // Explicit (Açıklamalı Dönüşüm)
        double sonuc2 = i; // Unexplicit

        System.out.println("Sonuç 1: " + sonuc1); // 22 (Veri kaybına yol açtı)
        System.out.println("Sonuç 2: " + sonuc2); // 51.0

        // 2. Sayısaldan Metne
        String sonuc3 = String.valueOf(d); // "22.53"
        String sonuc4 = String.valueOf(i); // "51"

        System.out.println("Sonuç 3: " + sonuc3);
        System.out.println("Sonuç 4: " + sonuc4);

        // 3. Metinden Sayısala
        String yazi1 = "58";
        String yazi2 = "35.58";

        int sonuc5 = Integer.parseInt(yazi1);
        double sonuc6 = Double.parseDouble(yazi2);
        System.out.println("Sonuç 5: " + sonuc5);
        System.out.println("Sonuç 6: " + sonuc6);
    }
}
