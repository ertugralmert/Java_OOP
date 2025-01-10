package com.javajedi.J12_Abstract_Class.entity2;

public class Kare extends Sekil{
    // sekil class extends aldım.
    double kenarUzunlugu;

    // Kare şeklinin rengini dışarıdan alacağız.
    public Kare(String renk, double kenarUzunlugu) {
        super(renk);
        this.kenarUzunlugu = kenarUzunlugu;

    }
    @Override
    public double alanHesapla() {
        return kenarUzunlugu * kenarUzunlugu;
    }
}
