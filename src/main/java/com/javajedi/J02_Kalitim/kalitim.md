# Kalıtım - Inheritance
![kalitim](/resources/images/kalitim.png)
Bu kısımda classlar'da tnaımlanan ortak ifadeleri tek bir çatı altında tutacağız.
* ortak değişkenler bir kural içinde olmalı. id long ise tüm class'larda long olmalı
* Hizmetli, Müdür, Mühendis, İnsanKaynakları sınıflarının ortak özelliklerini "Personel"  
    sınıfında tanımlayacağız.
* "Extends" ile kalıtım yaptık.
> Bir sınıfın başka bir sınıftan miras alma işlemi "extends" ile yapılır.

```java
import com.javajedi.J02_Kalitim.entity.Personel;

public class Mudur extends Personel{
    // görüldüğü gibi kalıtım yaptık
    
}

```
```java
public class Runner {
    public static void main(String[] args) {
        Mudur mudur = new Mudur();
        // bu kalıtım sayesinde "personel" sınıfındaki tüm değişkenlere erişebiliriz.
        mudur.ad = "Mehmet"; 
    }
}
```
> Not: Önce varlıklar tanımlanmalı sonrasında ortak değişkenlerin tanımlanması gerekiyor.