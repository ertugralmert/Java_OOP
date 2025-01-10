# OOP Giriş
# OOP Konuları
- [Inheritance](src/main/java/com/javajedi/J02_Kalitim/kalitim.md)
- [Constructor](src/main/java/com/javajedi/J03_Constructor/constructor.md)
- [Encapsulation](src/main/java/com/javajedi/J04_Encapsulation/encapsulation.md)
- [Overriding_Overloading](src/main/java/com/javajedi/J05_Overriding_Overloading/overriding_overloading.md)
- [super_keyword](src/main/java/com/javajedi/J06_Super_keyword/superkeyword.md)
- [Interface](src/main/java/com/javajedi/J07_Interface/interface.md)
- [Polymorphism](src/main/java/com/javajedi/J08_Polimorphism/polimorphism.md)
- [Ornek_notes.md](src/main/java/com/javajedi/J09_Ornek01/notes.md)
- [Enum](src/main/java/com/javajedi/J10_Enum/enum.md)
- [final_keyword](src/main/java/com/javajedi/J11_final_keyword/finalkeyword.md)
- [Abstract](src/main/java/com/javajedi/J12_Abstract_Class/abstractclass.md)
- [genelTekrar](src/main/java/com/javajedi/J13_OOP_GenelTekrar/geneltekrar.md)
- [cerezbilgiler](src/main/java/com/javajedi/cerezBilgiler.md)
---
Sınıf içinde tanımlanabilenler:  
    * Methodlar
    * Değişkenler
    * Inner Class
  
Bir varlığın durumunu tutan bilgilere STATE denir.  
STATE -> properties(property,prob), attribute(att) : Biz değişken diyoruz  

OOP kavramını anlamak için bir örnekle ilerleyelim.  
Kedi adında bir class oluşturalım.  
```java
public class Kedi{
    // Burada bir varlık tanımlayacağız.
    String tur;
    String cins;
    String ad;
    String tuyRengi;
    int yas;
    int yasamDongusu;
    int uzunluk;
    int agirlik;
    int ayakSayisi;
    int kuyrukUzunlugu;
    int aclikSuresi;
    
    // Burada varlıgın aksiyonları tanımlayacagız.
    /**
     * 1-uyuyor
     * 2- uyanık duruyor
     * 3- uyanık koşuyor
     * 4- hareket halinde
     * 5- koşuyor
     * 6- tırmalıyor
     * 7- uyanık ama yatıyor
     */
    
    int hareketDurumu;
    boolean acMi;
    int hiz;
    boolean yasiyorMU = true;
    // aksiyonları da tanımlamamız lazım bunlar "method" olarak tanımlanır.
    /**
     * Bir varlığın aksiyonları sınıflar içinde tanımlandığında terim olarak INTERFACE olarak tanımlanır.
     * Sınıf içindeki tüm method tanımları INTERFACE olarak tanımlanır.
     */
    
    // aksiyonları tanımlayalım
    public void uyandir(){
        if(hareketDurumu == 1){
            hareketDurumu = 2;
        }
    }
    
    public void doyur(){
        acMi = false;
        aclikSuresi == 0;
    }
    
    public void hizlan(){
        hiz += 5; // hiz = hiz + 5;
        if(hiz > 15){
            hareketDurumu = 5;
        }
    }
    // hayvanın yaşam döngüsü saat olarak yaşam süresini ifade eder
    public void zamanGecir() {
        if (yasiyorMU) {
            yasamDongusu++;
            aclikSuresi++;
            if (yasamDongusu % 12 == 0) { // her 12 saatte bir uyutalım
                System.out.println("Kedi uyudu.");
                hareketDurumu = 1;
            }
            if (yasamDongusu % 12 == 2 && hareketDurumu == 1) {
                System.out.println("Kedi uyandı.");
                hareketDurumu = 2;
            }
            if (yasamDongusu % 5 == 0){
                if ( aclikSuresi >= 25)
                    yasiyorMU = false;
            acMi = true;
        }
            if(yasamDongusu % (365 * 24 ) == 0){
                yas++;
                System.out.println("Doğum günü :)");
            }
            if(yas >= 13){
                yasiyorMU = false;
            }
    }else {
            System.out.println("Kedi Ölmüş :(");
        }
        
        
        
    }
}
```
Evet burada KEdi ile ilgili bir soyutlama yaptık.  
Kedinin özellikleri(değişkenlerini) ve aksiyonlarını (method) tanımladık.  

Şimdi nesne oluşturmamız ve adreslememiz gerekiyor.  
Bunu "new" ile yapacağız yani : -> Kedi kedi = new Kedi();
```java
// Yeni bir class oluşturduk. Adı Runner olsun
package com.javajedi;
import  com.javajedi.Kedi;
public class Runner{
    public static void main(String[] args){
        Kedi kedi = new Kedi(); // evet burada nesne oluşturup nesneyi "kedi" ye atadık.
        ked.zamanGecir();
        ked.zamanGecir();
        ked.zamanGecir();
        ked.zamanGecir();
        ked.zamanGecir();
        ked.zamanGecir();
        ked.zamanGecir();
        ked.zamanGecir(); // KEdi ile ilgili zaman geçir diyoruz
        // yasamDongusu artar 5 saat sonra hayvan acıkır. 12 saat sonra hareket durumu 1'e düşer
        
        
    }
}
```
Görüldüğü gibi nesne tanımladıktan sonra kedi ile ilgili aksiyonlar yaptırabiliyoruz.  
Çıktıları kendiniz de kontrol edebilirsiniz.  

> Bir varlığı tanımlarken öncelikle özelliklerini tanımlayıp sonrasında aksiyonları tanımlamalısınız!  

> Dikkat!!! Varlıkları soyutlarken tnaımlarken mutlaka "id" tanımlamalısınız.  

> Dikkat!!! -> int, double, float değişkenlerinde "==" ile kontrol sağlanabilir
> Long, String, Musteri gibi tanımlamalarda "equals" ile kontrol sağlanmalıdır.  

* OOP -> C++ 'tan sonra geçildi
* Nesneye yönemimli olması güçlü yanı onun dışında kalıtım, uygulamanın genişletilmesi
* Kodları anlamakta, organizasyonda kolaylık sağlıyor.
* Şimdilik bodoslama yazıyor konuyu kavramak için. Veritabanında OOP ilişkilendirme daha rahat olacak.
--

![gorsel](src/main/resources/images/OOP_Gorsel.png)

---
