package com.javajedi.J12_Abstract_Class.entity2;

public class Ucgen extends Sekil{

    double tabanUzunlugu;
    double yukselik;

    public Ucgen(String renk, double tabanUzunlugu, double yukselik) {
        super(renk);
        this.tabanUzunlugu = tabanUzunlugu;
        this.yukselik = yukselik;
    }

    @Override
    public double alanHesapla() {
        return tabanUzunlugu*yukselik/2;
    }
}
