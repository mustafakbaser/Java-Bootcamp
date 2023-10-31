package com.mustafabaser.javabootcamp.oop;

public class PersonsTestDrive {
    public static void main(String[] args) {
        Persons person = new Persons();
        // Atama (Setter)
        //person.ad = "Kürşad";
        person.setName("Kürşad");
        // Erişim (Getter)
        //System.out.println(person.ad);
        System.out.println(person.getName());
    }
}
