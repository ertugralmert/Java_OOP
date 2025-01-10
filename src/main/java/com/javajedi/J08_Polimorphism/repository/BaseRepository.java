package com.javajedi.J08_Polimorphism.repository;

import com.javajedi.J08_Polimorphism.entity.BaseEntity;

public class BaseRepository {
    /**
     * Normal şartlarda her repository sınıfında save(), delete(); update(), için method yazmamız gerekirdi.
     * Şimdi baserepository sayesinde sadece burada yazacağız.
     */
    public void save(BaseEntity entity){

    }
    public void delete(BaseEntity entity){

    }
    public void update(BaseEntity entity){

    }
    // görüldüğü gibi BaseEntity verdik.
}
