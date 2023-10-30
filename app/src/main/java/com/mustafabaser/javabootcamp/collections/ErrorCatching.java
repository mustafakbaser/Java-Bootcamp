package com.mustafabaser.javabootcamp.collections;

public class ErrorCatching {
    public static void main(String[] args) {
        // Hata Yakalama
        // 1. Compile Error
        final int x = 10;
        //x = 90; //Mantıksal hata, compile error.

        // 2. Runtime Error (Exception):
        int a = 10;
        int b = 0;

        try{
            System.out.println("Sonuç : " + (a/b));
            System.out.println("İşlem bitti.");
        }catch(Exception e){
            System.out.println("Hata : " + e.toString());
        }
    }
}
