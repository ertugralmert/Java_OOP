package com.javajedi.J04_Encapsulation.entity;

public class Musteri {
    // POJO Class oluşturlaım. Sonrasında sağ tıklayıp generate ile
    // encapsulation (getter setter) yapıp parametreli ve parametresiz constructor oluşturalım
    private Long id;
    private String ad;
    private String soyad;
    private String telefon;


    // default constructor
    public Musteri() {
    }

    // yine generate constructler ile parametreli constructor oluşturduk
    public Musteri(Long id, String ad, String soyad, String telefon) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
    }

    // genrate ile hepsi kolayca oluştu.
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

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
