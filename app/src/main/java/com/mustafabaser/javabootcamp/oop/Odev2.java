package com.mustafabaser.javabootcamp.oop;

public class Odev2 {
    // 1. Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri döndüren metod:
    public double hesaplaIcAciToplami(int kenarSayisi) {
        double icAciToplami = ((kenarSayisi - 2) * 180.0) / kenarSayisi;
        return icAciToplami;
    }

    // 2. Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod:
    public int maasHesapla(int gunSayisi){
        int calisilanSaat = 8;
        int saatlikUcret = 40;
        int saatlikMesaiUcreti = 80;
        int mesaiLimiti =  150;

        int calisilanToplamSaat = (gunSayisi * calisilanSaat);
        int maas = calisilanToplamSaat + saatlikUcret;

        // Mesai aşımı kontrolü
        if(calisilanToplamSaat > mesaiLimiti){ // 150 saatten fazlaysa mesai ücreti eklenecek.
            int toplamMesaiSaatleri = calisilanToplamSaat - mesaiLimiti;
            maas += toplamMesaiSaatleri * saatlikMesaiUcreti;
        }
        return maas;
    }

    // 3. Otopark süresine göre ücret hesaplayarak geri döndüren metod:
    public void otoparkUcretiHesapla(int otoparkSaati){
        int saatlikOtoparkUcreti = 50;
        int saatlikAsimUcreti = 10;

        if(otoparkSaati > 1){
            int saatFarki = otoparkSaati -1;
            int saatFarkiUcreti = saatFarki * saatlikAsimUcreti;
            int tutar = saatFarkiUcreti + saatlikOtoparkUcreti;
            System.out.println("Otopark ücreti " + tutar + " TL");
        }else if(otoparkSaati == 1){
            System.out.println(saatlikOtoparkUcreti + " TL");
        }else{
            System.out.println("Ücret yoktur.");
        }
    }

    // 4. Girilen kilometreyi mile dönüştüren metod:
    public double donustur(double kilometre){
        double sonuc = kilometre * 0.621;
        return sonuc;
    }

    // 5. Kenarları girilen dikdörtgenin alanını hesaplayan metod:
    public double alanHesapla(double kenarUzunlugu, double kenarGenisligi){
        double dikdortgeninAlani = kenarUzunlugu * kenarGenisligi;
        return dikdortgeninAlani;
    }

    // 6. Girilen sayının faktoriyelini hesaplayan metod:
    public int faktoriyelHesapla(int sayi){
        int faktoriyel = 1;
        for(int i = 1; i <= sayi; i++){
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    // 7. Girilen kelime içinde 'e' || 'E' harfini sayan metod:
    public int kelimeHesapla(String kelime){
        int sayac = 0;
        for(int i = 0; i < kelime.length(); i++ ){
            if(kelime.charAt(i) == 'e' || kelime.charAt(i) == 'E'){
                sayac++;
            }
        }
        return sayac;
    }
}
