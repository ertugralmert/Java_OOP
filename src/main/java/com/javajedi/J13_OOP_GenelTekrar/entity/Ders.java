package com.javajedi.J13_OOP_GenelTekrar.entity;

import java.util.UUID;

public class Ders {

    String id;
    String ad;
    String kod;
    String aciklama;

    //constructor -> parametreli
    public Ders(String ad, String kod, String aciklama){
        // UUID oluşturma
        this.id = UUID.randomUUID().toString();
        this.ad = ad;
        this.kod = kod;
        this.aciklama = aciklama;
    }
    //getter setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }


    // toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ders{");
        sb.append("id='").append(id).append('\'');
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", kod='").append(kod).append('\'');
        sb.append(", aciklama='").append(aciklama).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
