package com.javajedi.J13_OOP_GenelTekrar.repository;

import com.javajedi.J13_OOP_GenelTekrar.entity.Ders;

import java.util.ArrayList;

public interface Repository {

    void save(Ders ders);
    void delete (int index);
    ArrayList<Ders> findAll();
}
