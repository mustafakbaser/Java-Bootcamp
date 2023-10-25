package com.mustafabaser.javabootcamp.standart_programlama;

public class IfVeSwitchKullanimi {
    public static void main(String[] args) {
        int yas = 27;
        String isim = "Kürşad";

        if(yas >= 18){
            System.out.println("Reşitsiniz.");
        }else{
            System.out.println("Reşit değilsiniz.");
        }

        if(isim == "Kürşad"){ // Alternatif; == : isim.equals("Kürşad"); (Outdated)
            System.out.println("Merhaba " + isim);
        }else if(isim == "Mehmet"){
            System.out.println("Merhaba " + isim);
        }else {
            System.out.println("Tanınmayan kişi!");
        }

        String userName = "admin";
        String userPassword = "123456";

        if(userName == "admin" && userPassword == "123456"){
            System.out.println("Hoş geldiniz: " + userName);
        }else{
            System.out.println("Hatalı giriş.");
        }

        int sayi = 9;
        if(sayi == 9 || sayi == 10){
            System.out.println("Sayı 9 veya 10'dur.");
        }else{
            System.out.println("Sayı 9 veya 10 değildir.");
        }

        // Switch Yapısı (Kotlin dilinde When)
        int gun = 4;

        switch(gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı giriş");
                break;
        }
    }
}
