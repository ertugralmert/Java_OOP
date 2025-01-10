package com.javajedi.J02_Kalitim;

import com.javajedi.J02_Kalitim.entity.Mudur;

public class Runner {
    public static void main(String[] args) {
        Mudur mudur = new Mudur();
        mudur.id = 1L;
        mudur.ad = "Mert";
        mudur.soyad = "Yılmaz";
        // Görüldüğü gibi "Müdür" class'ında bir şey olmamasına rağmen "PErsonel" class'taki değişkenleri kullanabiliyoruz.


    }
}
