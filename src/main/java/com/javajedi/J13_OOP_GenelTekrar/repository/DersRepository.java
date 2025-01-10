package com.javajedi.J13_OOP_GenelTekrar.repository;

import com.javajedi.J13_OOP_GenelTekrar.entity.Ders;
import com.javajedi.J13_OOP_GenelTekrar.utility.DataBase;

import java.util.ArrayList;

public class DersRepository implements Repository{

    // Depolama işlemleri burada yapılıyor

    public void save(Ders ders){
        DataBase.dersListesi.add(ders);
        //Ders'i ekliyoruz.
    }

    public void delete(int index){
        DataBase.dersListesi.remove(index);
    }

    public ArrayList<Ders> findAll(){
        return DataBase.dersListesi;
    }
}
