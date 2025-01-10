package com.javajedi.J12_Abstract_Class.entity;

public abstract class Personel {
    public String ad;
    public String adres;

    abstract void maasHesapla();

    abstract void isYap();

   public void gulumse(){
        System.out.println(":)");
    }

   public void iseBasa(){
        System.out.println("işe başlandı");
    }

}
