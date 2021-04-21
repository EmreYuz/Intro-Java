package com.company;

public class Main {

    public static void main(String[] args) {

        String internetSubeButonu = "Internet Şubesi";
        double dolarDun = 8.15;
        double dolarBugun = 8.15;
        int vade = 36;
        boolean dustuMu = false;

        System.out.println(internetSubeButonu);

        if (dolarBugun > dolarDun) {
            System.out.println("Dolar düştü resmi");
        } else if (dolarBugun < dolarDun) {
            System.out.println("Dolar yükseldi resmi");
        } else {
            System.out.println("Dolar eşittir resmi");
        }

        String kredi1 = "Hızlı Kredi";
        String kredi2 = "Mutlu Emekli Kredisi";
        String kredi3 = "Konut Kredisi";
        String kredi4 = "Çiftçi Kredisi";
        String kredi5 = "MSB Kredisi";
        String kredi6 = "MEB Kredisi";

        String[] krediler = {kredi1, kredi2, kredi3, kredi4, kredi5, kredi6};

        for (String kredi : krediler) {
            System.out.println(kredi);
        }

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        int[] sayilar1 = {1, 2, 3, 4, 5};
        int[] sayilar2 = {10, 20, 30, 40, 50};
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);

        String sehir1 = "ankara";
        String sehir2 = "istanbul";
        sehir1 = sehir2;
        sehir2 = "izmir";
        System.out.println(sehir1);

    }
}
