package com.mustafabaser.javabootcamp.oop;

public class StaticKullanimi {
    public static void main(String[] args) {
        ClassA classA = new ClassA(); // Tek Nesne
        //System.out.println(classA.x);
        //classA.method();

        // Sanal nesne,İsimsiz Nesne (Virtual or Nameless Object)
        //System.out.println(new ClassA().x); // new ClassA() = classA (1.Nesne)
        //new ClassA().method(); // (2.Nesne)

        //İdeal Çalışma (Static yapı)
        System.out.println(ClassA.x);
        ClassA.method();
    }
}
