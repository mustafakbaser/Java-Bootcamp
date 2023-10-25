package com.mustafabaser.javabootcamp.standart_programlama;

public class Donguler {
    public static void main(String[] args) {
        // For Loops
        // 1'den 3'e kadar yazdır.
        for(int i = 1; i <= 3; i++){
            System.out.println("Döngü 1 : " + i);
        }

        // 10'dan 20'ye kadar 5'er 5'er ileri git.
        for(int i = 10; i<=20; i+=5){
            System.out.println("Döngü 2 : " + i);
        }

        // 20'den 10'a kadar 5'er 5'er geri git.
        for(int i = 20; i>=10; i-=5){
            System.out.println("Döngü 3 : " + i);
        }

        // While Loop
        // 1'den 3'e kadar yazdır.
        int sayac = 1;

        while(sayac <= 3){
            System.out.println("Döngü 4 : " + sayac);
            sayac++;
        }

        // For Loops: Break ve Continue:
        for(int i=1; i <= 5; i++){
            if(i==3){
                break; // Koşul sağlandığı anda durur ve devam etmez. 1,2
            }
            System.out.println("Döngü 5 : " + i);
        }

        for(int i=1; i <= 5; i++){
            if(i==3){
                continue; // Bu adımı pas geçer ve devam eder. 1,2,4,5
            }
            System.out.println("Döngü 5 : " + i);
        }


    }
}
