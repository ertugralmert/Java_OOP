package com.javajedi.J13_OOP_GenelTekrar.controller;

import com.javajedi.J13_OOP_GenelTekrar.entity.Ders;
import com.javajedi.J13_OOP_GenelTekrar.service.DersService;

import java.util.Scanner;

public class DersController {
    /**
     * Tüm IO - Input/Output işlemlerini burada yapıyoruz.
     * Scanner
     * System.out.prinln("");
     */

    private DersService service;

    public DersController(){
        service = new DersService();
    }

    public void DersEkle(){
        System.out.println("""
                *** Ders Ekleme ***
                """);
        System.out.println("Dersin adı: ");
        String ad = new Scanner(System.in).nextLine();
        System.out.println("Ders Kodu: ");
        String kod = new Scanner(System.in).nextLine();
        System.out.println("Ders Açıklaması: ");
        String aciklama = new Scanner(System.in).nextLine();
        // ders nesnesini aldığımız bilgilerle oluşturuyoruz
        Ders ders = new Ders(ad,kod,aciklama);

        // kaydet işlemi için
        service.save(ders);
    }
}
