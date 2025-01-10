package com.javajedi.J13_OOP_GenelTekrar;

import com.javajedi.J13_OOP_GenelTekrar.controller.DersController;

public class Runner_Ders {
    // katmanlar oluştu. repository, service, controller

    public static void main(String[] args) {
        DersController controller = new DersController();

        // bu kadar basit
        // kod controller çalıştırcak ders bilgilerini gireceğiz
        //service katmanına geçecek işlemler yapılacak
        // repository kaydetme işlemini yapacak
        // tüm bilgiler Database'deki ArrayList'e eklencek.

        controller.DersEkle();
    }
}
