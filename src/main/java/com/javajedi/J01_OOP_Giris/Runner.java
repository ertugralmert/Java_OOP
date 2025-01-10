package com.javajedi.J01_OOP_Giris;

import com.javajedi.J01_OOP_Giris.entity.Musteri;
import com.javajedi.J01_OOP_Giris.entity.Satis;
import com.javajedi.J01_OOP_Giris.entity.Urun;

public class Runner {
    // Burada Müşter, Satiş Urun gibi varlıkları tanımladık şimdi bunları bu sınıfta nesne oluşturup kullanacağız
    public static void main(String[] args) {
        Musteri musteri = new Musteri();
        musteri.id = 1L;
        musteri.ad = "Mert";

        Musteri musteri2 = new Musteri();
        musteri2.id = 2L;
        musteri2.ad = "Dilara";

        Urun urun = new Urun();
        urun.id = 400L;
        urun.marka = "Asus";
        urun.model = "ASX";
        urun.ad = "Anakart i9";

        Urun urun2 = new Urun();
        urun2.id = 401L;
        urun2.marka = "Kingstone";
        urun2.model = "DDR5";
        urun2.ad = "Ram 64GB";

        Urun urun3 = new Urun();
        urun3.id = 402L;
        urun3.marka = "HP";
        urun3.model= "27";
        urun3.ad = "Monitor";

        // Bunları dizide tutalım
        Musteri[] musteriler = new Musteri[]{musteri,musteri2};
        Urun[] urunler = new Urun[]{urun,urun2,urun3};

        // musteri ve ürünleri ekledik şimdi satış yapabiliriz.
        Satis satis = new Satis();
        satis.id = 100L;
        satis.musteriId = 2L;
        satis.urunId = 401L;
        satis.adet = 2;
        satis.fiyat = 500;
        satis.toplamFiyat = 1000;

        //satışı kimin aldığını bulmak istiyorum diyorum
        Satis[] satislar = new Satis[]{satis};

        for (int i = 0; i <satislar.length; i++){
            Long musteriId = satislar[i].musteriId;
            Long urunId = satislar[i].urunId;
            for(int j = 0; j<musteriler.length; j++){
                if( musteriler[j].id.equals(musteriId)) System.out.println("Müşteri adı: "+ musteriler[j].ad);
            }
            for(int j = 0 ; j < urunler.length; j++){
                if(urunler[j].id.equals(urunId))
                    System.out.println("Ürün adı: " + urunler[j].ad);
            }
            System.out.println("*******");
            /**
             * Output:
             * Müşteri adı: Dilara
             * Ürün adı: Ram 64GB
             */
        }


    }
}
