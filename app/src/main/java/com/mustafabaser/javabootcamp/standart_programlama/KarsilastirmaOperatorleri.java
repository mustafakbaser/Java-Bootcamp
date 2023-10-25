package com.mustafabaser.javabootcamp.standart_programlama;

public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 40;
        int b = 50;

        int x = 90;
        int y = 80;

        // Karşılaştırma (Comparison) Operatörleri:

        System.out.println("a == b  : " + (a==b));  // A, B'ye eşit mi?
        System.out.println("a != b  : " + (a!=b));  // A, B'ye eşit değil mi?
        System.out.println("a > b   : " + (a>b));   // A, B'den büyük mü?
        System.out.println("a >= b  : " + (a>=b));  // A, B'den büyük veya eşit mi?
        System.out.println("a < b   : " + (a<b));   // A, B'den küçük mü?
        System.out.println("a <= b  : " + (a<=b));  // A, B'den küçük veya eşit mi?

        System.out.println("a > b  || x > y : " + (a > b || x > y)); // İki durum için kontrol, || (OR - veya) operatörü
        // İki durumdan biri true olduğu durumda true, diğer durumlarda false.

        System.out.println("a > b  && x > y : " + (a > b && x > y)); // İki durum için kontrol, && (AND - ve) operatörü
        // İki durumun da true olduğu durumda true, diğer durumlarda false.
    }
}
