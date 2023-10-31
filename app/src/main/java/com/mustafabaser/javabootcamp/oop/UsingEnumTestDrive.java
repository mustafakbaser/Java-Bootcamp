package com.mustafabaser.javabootcamp.oop;

public class UsingEnumTestDrive {
    public static void main(String[] args) {

        ucretHesapla(KonserveBoyut.KUCUK, 150);
    }

    // Static fonksiyonun içerisinde kullanacağımız başka bir fonksiyonun da static olması gerekiyor.
    public static void ucretHesapla(KonserveBoyut boyut, int adet){
        switch(boyut){
            case KUCUK:
                System.out.println("Ücret : " + (adet * 24) + " ₺");
                break;
            case ORTA:
                System.out.println("Ücret : " + (adet * 32) + " ₺");
                break;
            case BUYUK:
                System.out.println("Ücret : " + (adet * 48) + " ₺");
                break;
        }

    }
}
