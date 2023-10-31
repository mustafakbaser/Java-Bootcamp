package com.mustafabaser.javabootcamp.oop.inheritance;

public class InheritanceTestDrive {
    public static void main(String[] args) {
        Saray topkapiSarayi = new Saray();
        topkapiSarayi.setKuleSayisi(4);
        topkapiSarayi.setPencereSayisi(50);

        System.out.println("Topkapı Sarayı kule sayısı: " + topkapiSarayi.getKuleSayisi());
        System.out.println("Topkapı Sarayı pencere sayısı: " + topkapiSarayi.getPencereSayisi());

        Villa bogazVilla = new Villa();
        bogazVilla.setGarajVarMi(true);
        bogazVilla.setPencereSayisi(10);

        System.out.println("Villanın garajı var mı: " + bogazVilla.isGarajVarMi());
        System.out.println("Villanın pencere sayısı: " + bogazVilla.getPencereSayisi());


        // Upcasting
        // Subclass -> Superclass dönüşümü

        Saray saray = new Saray();
        Ev ev = saray;

        // Downcasting
        // Superclass -> Subclass dönüşümü
        Ev home = new Ev();
        Saray palace = (Saray) home; // (Saray) downcasting

        // Type Control
        if(topkapiSarayi instanceof Saray){ // topkapiSarayi Saray nesnesinden türediyse şunu yap:
            System.out.println("Saraydır.");
        }else{
            System.out.println("Saray değildir.");
        }
    }
}
