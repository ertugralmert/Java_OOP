package com.javajedi.J09_Ornek01.entity;

import com.javajedi.J09_Ornek01.utility.StaticValues;

public class KrediKarti implements OdemeYontemi {
    Long id;
    double tutar;

    public KrediKarti(double tutar) {
        this.id = ++StaticValues.sequenceId;
        this.tutar = tutar;
    }

    @Override
    public double getTutar() {
        System.out.println("Kredi Kartı ile odeme yapıldı");
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
