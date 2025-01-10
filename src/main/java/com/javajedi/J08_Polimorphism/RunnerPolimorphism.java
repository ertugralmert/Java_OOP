package com.javajedi.J08_Polimorphism;

import com.javajedi.J08_Polimorphism.entity.Musteri;
import com.javajedi.J08_Polimorphism.entity.Satis;
import com.javajedi.J08_Polimorphism.repository.MusteriRepository;
import com.javajedi.J08_Polimorphism.repository.SatisRepository;

public class RunnerPolimorphism {
    public static void main(String[] args) {
        /**
         * Eğer polimorphism kullanmayasaydık save() methodunu kullanamazdık. Çünkü bizden bir entity bekliyor.
         * müşteri ve satis için ayrı ayrı eklemek için polimorphism kullanmamız lazım.
         * şimdi aşağıda çok rahatlıkla save() içine müşteri,ürün veya satis entity yazabilirim.
         */
        MusteriRepository musteriRepository = new MusteriRepository();
        musteriRepository.save(new Musteri());

        SatisRepository satisRepository = new SatisRepository();
        satisRepository.save(new Satis());
    }
}
