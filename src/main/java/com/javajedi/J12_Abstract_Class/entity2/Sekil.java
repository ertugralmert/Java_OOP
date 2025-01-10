package com.javajedi.J12_Abstract_Class.entity2;

public abstract class Sekil {
    public String renk;

    // parametreli constructor
    //this bu classtaki renk ifade eder.
    public Sekil(String renk){
        this.renk = renk;
    }

    // abstract yaptık -> üçgen, kare alanın hesaplamaları farklı o yüzden burada gövde yazmanın anlamı yok.
    public abstract double alanHesapla();

    public void bilgiVer(){
        System.out.println("Bu bir şekildir.");
    }
}
