package com.javajedi.J13_OOP_GenelTekrar.service;

import com.javajedi.J13_OOP_GenelTekrar.entity.Ders;
import com.javajedi.J13_OOP_GenelTekrar.repository.DersRepository;
import com.javajedi.J13_OOP_GenelTekrar.repository.Repository;

import java.util.ArrayList;

public class DersService {
    /**
     * Eğer gerekli ise diğer servisler ile iletişime geçmek ve yapılacak
     * işlemleri tamamlamakla yükümlüdür.
     * Asıl işin yürütüldüğü kısımdır.
     */

    // bu katmanlı yapı ileride başka bir repository sınıfı kullanırsak sadece
    // aşağıdaki private tanımı değiştirmemiz yeterli olack.


    // burada new'leme işlemi yapılmaz gereksiz bellek tüketimi olur kullanıacağımız zaman new'lenir.
    // o yüzden constructor içinde new'leme yapıyoruz.
    private Repository dersRepository;

    public DersService(){
        //polimorphism
        dersRepository = new DersRepository();
    }

    public void save(Ders ders){
        dersRepository.save(ders);
    }

    public void delete(int index){
        dersRepository.delete(index);
    }

    public ArrayList<Ders> findAll(){
        return dersRepository.findAll();
    }
}
