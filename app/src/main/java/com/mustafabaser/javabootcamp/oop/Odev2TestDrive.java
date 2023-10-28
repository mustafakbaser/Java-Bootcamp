package com.mustafabaser.javabootcamp.oop;

public class Odev2TestDrive {
    public static void main(String[] args) {
        // 1. Girilen kenar sayısına göre her bir iç açıları hesaplayıp sonucu geri döndüren metod:
        Odev2 odev2 = new Odev2();
        double icAcilarinToplami = odev2.hesaplaIcAciToplami(5);
        System.out.println("İç Açılarının Toplamı: " + icAcilarinToplami);

        // 2. Girilen gün sayısına göre maaş hesabı yapan metod:
        int maas = odev2.maasHesapla(25);
        System.out.println("---------------------------");
        System.out.println("Toplam maaş: " + maas + " TL");

        // 3. Otopark süresine göre ücret hesaplayarak geri döndüren metod:
        System.out.println("---------------------------");
        odev2.otoparkUcretiHesapla(5);

        // 4. Girilen kilometreyi mile dönüştüren metod:
        double kilometre = 130;
        System.out.println("---------------------------");
        System.out.println(kilometre + " kilometrenin mil karşılığı: " + odev2.donustur(kilometre) + " mil.");

        // 5. Kenarları girilen dikdörtgenin alanını hesaplayan metod:
        double dikdortgeninAlani = odev2.alanHesapla(15,10);
        System.out.println("---------------------------");
        System.out.println("Dikdörtgenin alanı: " + dikdortgeninAlani);


        // 6. Girilen sayının faktoriyelini hesaplayan metod:
        int hesaplanacakSayi = 10;
        int faktoriyel = odev2.faktoriyelHesapla(hesaplanacakSayi);
        System.out.println("---------------------------");
        System.out.println(hesaplanacakSayi + " sayısının faktoriyeli: " + faktoriyel);

        // 7. Girilen kelime içinde 'e' || 'E' harfini sayan metod:
        String kelime = "Developer";
        int harfSayisi = odev2.kelimeHesapla(kelime);
        System.out.println(kelime + " kelimesindeki e harfi sayısı: " + harfSayisi);
    }
}
