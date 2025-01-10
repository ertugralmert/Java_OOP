package com.javajedi.J12_Abstract_Class;

import com.javajedi.J12_Abstract_Class.entity.Memur;
import com.javajedi.J12_Abstract_Class.entity.Mutemet;
import com.javajedi.J12_Abstract_Class.entity.Personel;

public class Runner_Abstract {
    public static void main(String[] args) {
        Personel personel;
        personel = new Memur();
        personel = new Mutemet();
        // personel içindekiler geliyor.
        personel.gulumse();
        personel.ad = "mert";
        personel.adres  = "İzmir";
    }
}
