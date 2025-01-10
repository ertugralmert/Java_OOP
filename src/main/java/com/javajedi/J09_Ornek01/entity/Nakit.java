package com.javajedi.J09_Ornek01.entity;

import com.javajedi.J09_Ornek01.utility.StaticValues;

public class Nakit implements OdemeYontemi{
    Long id;
    double tutar;


    public Nakit(double tutar) {
        this.id = ++StaticValues.sequenceId;
        this.tutar = tutar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTutar() {
        System.out.println("Nakit Ödendi");
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }
}
