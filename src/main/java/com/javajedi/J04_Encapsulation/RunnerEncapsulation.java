package com.javajedi.J04_Encapsulation;


import com.javajedi.J04_Encapsulation.entity.Urun;

public class RunnerEncapsulation {
    public static void main(String[] args) {
        // Urun class'ındaki "this" parametresine devam
        Urun urun = new Urun();
        urun.setAd("Şeker");
        urun.setFiyat(365);

        System.out.println("id: " + urun.getId());
        System.out.println("ad: "+ urun.getAd());
        System.out.println("fiyat: "+ urun.getFiyat());
        /**
         * Output:
         * id: 470
         * ad: Şeker
         * fiyat: 365.0
         */

        // şimdi Urun class'ında parametreli constructor oluşturalım ve sadece ad ve fiyat değişkenlerine deger atayalım
        Urun urun2 = new Urun("Yağ", 120);
        System.out.println("id: " + urun2.getId());
        System.out.println("ad: "+ urun2.getAd());
        System.out.println("fiyat: "+ urun2.getFiyat());
    }

}
