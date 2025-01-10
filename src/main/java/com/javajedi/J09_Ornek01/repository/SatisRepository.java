package com.javajedi.J09_Ornek01.repository;

import com.javajedi.J09_Ornek01.entity.Nakit;
import com.javajedi.J09_Ornek01.entity.OdemeYontemi;
import com.javajedi.J09_Ornek01.utility.StaticValues;

public class SatisRepository {
    // satılan ürünü kaydet

    public void urunSatis(OdemeYontemi odemeYontemi, String urun){
        System.out.println(urun+ " adlı ürün satıldı");
        StaticValues.nakitKasasi += odemeYontemi .getTutar();
    }
}
