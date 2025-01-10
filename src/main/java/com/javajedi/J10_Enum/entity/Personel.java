package com.javajedi.J10_Enum.entity;

public class Personel {
    private String uuid;
    private String ad;
    private String adres;
    private String telefon;
    private Unvan unvani;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Unvan getUnvani() {
        return unvani;
    }

    public void setUnvani(Unvan unvani) {
        this.unvani = unvani;
    }
}
