package com.mustafabaser.javabootcamp.oop.composition;

public class UsingComposition {
    public static void main(String[] args) {
        Categories kategori1 = new Categories(1,"Dram");
        Categories kategori2 = new Categories(2,"Komedi");

        Directors yonetmen1 = new Directors(1,"Q. Tarantino");
        Directors yonetmen2 = new Directors(2,"C. Nolan");

        Movies film1 = new Movies(1, "Django", 2013, kategori1, yonetmen1);

        System.out.println("Film Id: " + film1.getFilm_id());
        System.out.println("Film Adı: " + film1.getFilm_ad());
        System.out.println("Film Yılı: " + film1.getFilm_yil());
        System.out.println("Film Kategorisi: " + film1.getKategori().getKategori_ad());
        System.out.println("Film Yönetmeni: " + film1.getYonetmen().getYonetmen_ad());
    }
}
