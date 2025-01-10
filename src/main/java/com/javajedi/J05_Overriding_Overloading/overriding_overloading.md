# OverRiding
* methodların üzerine yazılması.  
Yani miras aldığımız methodun aynısını alt sınıfa yazıyoruz.  
Özelleştirmiş oluyoruz. örnek vermem gerekirse  
```java
// bir tane PErsonel ana sınıfımız olsun
public class Personel{
    private String brans;
    private int maasCarpani;
    private double maas; 
    // uzatmak istemiyorum o yüzden  hesap yapmadan kısaca anlatmaya çalışacağım.
    
    // maaş hesaplanacak bir method yazalım.
    //getter setter unutmayın!!!
    public double maasHesapla(){
        double toplam = maasCarpani * maas;
        double netMaas = toplam - (toplam * 0.18) - (toplam * 0.008);
        System.out.println("Personelin Maaşı Hesaplandı");
        return netMaas;
        
    }
    // yukarıdaki methodda gördüğünüz üzere basit bir maaş hesaplaması yaptık.
    // şimdi hizmetli adında bir sınıf açalım ve bu methodu hizmetli'ye göre ayarlayalım.
}
```
```java
public class Hizmetli extends Personel{
    // gördüğünüz üzere Personel sınıfını extend ettik yani miras aldık.
    // Şimdi Hizmetli için parametreli bir constructor oluşturalım.
    public Hizmetli ( double maas, int maasCarpani){
        setMaas(maas);
        setMaasCarpani(maasCarpani);
    }
    // yukarıda Hizmetli'ye özel maas ve maasçarpanı verdik
    // artık Hizmetli'ne ozel bir method yazalım.
    @Override
    public double maasHesapla(){
        double toplam = getMaas()*getMaasCarpani();
        double netMaas = toplam - (toplam * 0.18) - (toplam * 0.008);
        System.out.println("Hizmetlinin Maaşı Hesaplandı");
        return netMaas;
    }
    // görüldüğü üzere Personel sınıfında maas hesapla methodunu override ettik. Böylece
    // Hizmetli'nin maaşını Hizmetliye göre yazmış olduk. 
    // Burada amaç ana sınıfta bir maaş hesapla methodu olduğunun bilinmesi ve 
    // alt sınıfların bu yapıya uygun maaş hesaplamaya çalışmasıdır.
}
```

---

# Overloading
* tek bir method adı ile birden fazla işlem yapabilme. 
* örnek ile açıklayalım.  
Dbİslemleri ile ilgili bir sınıfımız olsun.  
Bu sınıfta Müdür, mühendis ve işçi olsun.  
Bu işçi mühendis ve müdür kaydetme işlemleri için tek bir method adı tanımlayacağız.  
Sonrasında kullanmak istediğimizde aynı method ismi ile işlem yapacağız aşağıda örnek:  
```java
public class DbIslemleri{
    public void kaydet(Mudur mudur){
        System.out.println("Müdür kaydedildi");
    }
    public void kaydet(Muhendis muhendis){
        System.out.println("Mühendis kaydedildi");
    } 
    public void kaydet(Isci isci){
        System.out.println("Isçi kaydedildi");
    }
    // Yukarıda görüldüğü üzere kaydet adı ile 3 farklı varlık kaydetme method tanımladık.
    // bu method kullanmak istediğimizde aşağıdaki örnekteki gibi kullanacağız.
}
```
```java
public class Runner {
    public static void main(String[] args) {
        DbIslemleri dbIslemleri = new DbIslemleri();
        Mudur mudur = new Mudur();
        dbIslemleri.kaydet(mudur);
        
        Muhendis muhendis = new Muhendis();
        dbIslemleri.kaydet(muhendis);
        
        Isci isci = new Isci();
        dbIslemleri.kaydet(isci);

        /**
         * OutPut:
         * Müdür kayıt edildi
         * Mühendis kayıt edildi
         * İşçi kayıt edildi
         */

        // görüldüğü üzere sadece "kaydet()" methodu ile 3 farklı varlık kaydetme işlemi yaptık.
        // Bu duruma OverLoading denir.
    }
}
```