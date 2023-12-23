package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        int vade = 12;

        double usdDun = 18.20;
        double usdBugun = 18.30;

        boolean usdDustuMu = false;

        String okYonu = "";

        if (usdBugun < usdDun) { //true
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (usdBugun > usdDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        //array

        String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}