package com.mustafabaser.javabootcamp.oop;

public class Car {
        String model;
        String renk;
        int hizLimiti;
        int anlikHiz;
        boolean calisiyorMu;

        // this = Araba, bulunduğu class'ı temsil eder.
        // Swift dilinde self = this

        // Constructor (Bu classtan her nesne oluşturulduğunda bu constractor çalışır, class ile aynı isimde olmalıdır)
        // Constructur = Init Function
        public Car(){
                System.out.println("Nesne oluştu");
        }

        public Car(String model, String renk, int hizLimiti, int anlikHiz, boolean calisiyorMu) {
                this.model = model; // Shadowing = Gölgeleme
                this.renk = renk;
                this.hizLimiti = hizLimiti;
                this.anlikHiz = anlikHiz;
                this.calisiyorMu = calisiyorMu;
        }

        public void bilgiAl(){
                System.out.println("---------------------");
                System.out.println("Model           : " + model);
                System.out.println("Renk            : " + renk);
                System.out.println("Hız Limiti      : " + hizLimiti);
                System.out.println("Çalışıyor Mu    : " + calisiyorMu);
                System.out.println("Anlık Hız       : " + anlikHiz + " KM/H");
        }

        public void calistir(){ // Side Effect: bir metodun bulunduğu sınıfın özelliğini değiştirmesi.
                calisiyorMu = true;
                anlikHiz = 24;
        }

        public void durdur(){
                calisiyorMu = false;
                anlikHiz = 0;
        }

        public void hizlan(int miktar){
                anlikHiz += miktar;
        }

        public void yavasla(int miktar){
                anlikHiz -= miktar;
        }
}
