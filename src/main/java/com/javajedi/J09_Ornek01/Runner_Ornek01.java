package com.javajedi.J09_Ornek01;

import com.javajedi.J09_Ornek01.entity.KrediKarti;
import com.javajedi.J09_Ornek01.entity.Nakit;
import com.javajedi.J09_Ornek01.repository.SatisRepository;
import com.javajedi.J09_Ornek01.utility.StaticValues;

public class Runner_Ornek01 {

    public static void main(String[] args) {
        SatisRepository repository = new SatisRepository();
        Nakit nakit = new Nakit(400);
        repository.urunSatis(nakit, "2 kg şeker");

        //yeni satış yapalım
        repository.urunSatis(new Nakit(9000),"İkinci El Telefon");
        repository.urunSatis(new Nakit(2000),"aypon 15");
        // System.out.println("Satış Adedi: " + StaticValues.sequenceId);
        // System.out.println("Toplam Nakit: " + StaticValues.nakitKasasi);
        /**
         * output:
         * 2 kg şeker adlı ürün satıldı
         * İkinci El Telefon adlı ürün satıldı
         * aypon 15 adlı ürün satıldı
         * Satış Adedi: 3
         * Toplam Nakit: 11400.0
         */
        // Ödeme yönetimini tanımladık şimdi kredi kartı ile ödeme yapalım
        repository.urunSatis(new KrediKarti(45000),"monitor 15");
        repository.urunSatis(new KrediKarti(32000),"pc 15");
        System.out.println("Satış Adedi: " + StaticValues.sequenceId);
        System.out.println("Toplam Nakit: " + StaticValues.nakitKasasi);
        /**
         * Output:
         * 2 kg şeker adlı ürün satıldı
         * İkinci El Telefon adlı ürün satıldı
         * aypon 15 adlı ürün satıldı
         * monitor 15 adlı ürün satıldı
         * pc 15 adlı ürün satıldı
         * Satış Adedi: 5
         * Toplam Nakit: 88400.0
         */
    }
}
