package com.mustafabaser.javabootcamp.oop.using_override;

public class OverrideTestDrive {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        hayvan.sesCikar(); // Kalıtım yok, kendi metoduna erişti.

        Memeli memeli = new Memeli();
        memeli.sesCikar(); // Kalıtım var, kalıtım yoluyla üst class'ın metoduna erişti.

        Kedi kedi = new Kedi();
        kedi.sesCikar(); // Kalıtım var, ancak kendi metoduna erişti.

        Kopek kopek = new Kopek();
        kopek.sesCikar() ; // Kalıtım var, kendi metoduna erişti.
    }
}
