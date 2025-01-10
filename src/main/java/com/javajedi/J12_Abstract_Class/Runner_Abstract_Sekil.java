package com.javajedi.J12_Abstract_Class;

import com.javajedi.J12_Abstract_Class.entity2.Kare;
import com.javajedi.J12_Abstract_Class.entity2.Sekil;
import com.javajedi.J12_Abstract_Class.entity2.Ucgen;

public class Runner_Abstract_Sekil {

    public static void main(String[] args) {
        /**
         * Alan Hesaplama:
         * ücgen -> taban uzunluğu * yükseklik / 2
         * kare -> kenar uzunluğu * kenar uzunluğu
         * diktörgent -> a kenarı * b kenarı
         * altıgen -> 3 kök 3 * kenar uzunluğu karesi / 2
         */
        //örnek altıgen alan
        int kenarUzunlugu = 6;
        double altigen = 3 * Math.sqrt(3) * kenarUzunlugu * kenarUzunlugu ;

        Sekil sekil = new Kare("Yeşil", 7);
        sekil.bilgiVer();
        System.out.println("Karennin Alanı: "+ sekil.alanHesapla());
        /**
         * Output:
         * Bu bir şekildir.
         * Karennin Alanı: 49.0
         */

        sekil = new Ucgen("Kırmızı",5,6);
        sekil.bilgiVer();
        System.out.println("Uçgenin Alanı: "+ sekil.alanHesapla());
        /**
         * Output:
         * Bu bir şekildir.
         * Uçgenin Alanı: 15.0
         */

    }
}
