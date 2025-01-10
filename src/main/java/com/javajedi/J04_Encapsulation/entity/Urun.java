package com.javajedi.J04_Encapsulation.entity;

import java.util.Random;

public class Urun
{
    // "this" kavramını açıklayalım.
   private Long id;
    private String ad;
    private double fiyat;

    // constructor
    public Urun() {
        // bakın şimdi buradaki id'yi ne yapacağız
        this.id = new Random().nextLong(1,1500 );
    }

    // parametreli constructor
    public Urun(String ad, double fiyat) {
        this(); // bu sınıfın default constructor'ına gider ve id'yi oluşturur
        this.ad = ad;
        this.fiyat = fiyat;
    }


    // getter ve setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
