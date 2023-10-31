package com.mustafabaser.javabootcamp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListOOP {
    public static void main(String[] args) {
        Products product1 = new Products(1,"Kahve Makinesi",8000,15);
        Products product2 = new Products(2,"Telefon",52000,50);
        Products product3 = new Products(3,"Bilgisayar",30000,10);

        ArrayList<Products> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        // Sort
        System.out.println("---------- İsme Göre Artan Sıralama -----------");
        Collections.sort(productList, new Siralama1());

        for(Products product:productList){
            System.out.println("Id " + product.getId() + " | Ürün Adı: " + product.getName() + " | Fiyat: " + product.getPrice() + "TL"  + " | Miktar: " + product.getQuantity() + " Adet");
        }

        System.out.println("---------- İsme Göre Artan Azalan -----------");
        Collections.sort(productList, new Siralama2());

        for(Products product:productList){
            System.out.println("Id " + product.getId() + " | Ürün Adı: " + product.getName() + " | Fiyat: " + product.getPrice() + "TL"  + " | Miktar: " + product.getQuantity() + " Adet");
        }

        System.out.println("---------- Fiyata Göre Artan Artan -----------");
        Collections.sort(productList, new Siralama3());

        for(Products product:productList){
            System.out.println("Id " + product.getId() + " | Ürün Adı: " + product.getName() + " | Fiyat: " + product.getPrice() + "TL"  + " | Miktar: " + product.getQuantity() + " Adet");
        }

        System.out.println("---------- Fiyata Göre Artan Azalan -----------");
        Collections.sort(productList, new Siralama4());

        for(Products product:productList){
            System.out.println("Id " + product.getId() + " | Ürün Adı: " + product.getName() + " | Fiyat: " + product.getPrice() + "TL" + " | Miktar: " + product.getQuantity() + " Adet");
        }
    }

    // Sort (İsme Göre Artan)
    public static class Siralama1 implements Comparator<Products>{
        @Override
        public int compare(Products p1, Products p2){
            return p1.getName().compareTo(p2.getName());
        }
    }

    // Sort (İsme Göre Azalan)
    public static class Siralama2 implements Comparator<Products>{
        @Override
        public int compare(Products p1, Products p2){
            return p2.getName().compareTo(p1.getName());
        }
    }

    // Sort (Fiyata Göre Artan)
    public static class Siralama3 implements Comparator<Products>{
        @Override
        public int compare(Products p1, Products p2){
            // integer karşılaştırmak için: int (primitive) -> Integer (Nesne tabanlı referans tip)
            return new Integer(p1.getPrice()).compareTo(p2.getPrice());
        }
    }

    // Sort (Fiyata Göre Azalan)
    public static class Siralama4 implements Comparator<Products>{
        @Override
        public int compare(Products p1, Products p2){
            // integer karşılaştırmak için: int (primitive) -> Integer (Nesne tabanlı referans tip)
            return new Integer(p2.getPrice()).compareTo(p1.getPrice());
        }
    }

}
