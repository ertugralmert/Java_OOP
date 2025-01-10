# Constructor
* Yapıcı, Kurucu method diyebiliriz.  

Bazen bir varlık yaratıldığı zaman default değerleri olması gerekiyor.  
Nesneler yaratılırken default değerlerin olmasını sağlayan yapı Constructor'dır.  
Mesela bir kedi oluşturuyoruz diyelim bu kedini yaşı, ağırlı, uzunlugu gibi kavramları  
defaul olarak nesne yaratılırken vermemiz gerekir.  
* Bir sınıftan nesne yaratan methodtur
* Geri dönüş tipi yoktur.
> Dikkat!!! Geri dönüş tipi olmamasına rağmen nesne yarattığı için nesnesin referans  
    adresini geri döner.  
    Nesne yaratılması esnasında sınıf paremetlerine değer atama işlemi burada yapılır.

* Örnek ile açıklayalım.
```java
public class Kedi {
    public String tur;
    public String cins;
    public int yas;
    public String tuyRengi;
    public int agirlik;
    public int uzunluk;

    /**
     *Default Constructer : Sınıf adı ile aynı ada sahip method tanımlanır.
     * Biz yazmasak bir her class'ta mevcuttur. default olarak. nesne tanımlaması için gerekli.
     * Biz new'leme işlemi yaptığımızda yazmasak bile arka planda otomatik çalışır. method çağırıyoruz
     * Yani biz yazamasak bile her sınıfta otomatik tanımlıdır.
     */
    public Kedi(){
        System.out.println("Constructor Çalıştı!!!");
    }
}
```
* Şimdi aynı örneği içinde değişken yapayarak yapalım.  
```java
public class Kedi(){
    public String tur;
    public String cins;
    public int yas;
    public String tuyRengi;
    public int agirlik;
    public int uzunluk;
    
    // default constructer
    public Kedi(){
        System.out.println("Constructor çalıştı");
        // default değerlek atadık. bu new'lenirken bu değerler ile oluşacak.
        tur = "Van Kedisi";
        yas = 1;
        agirlik = 230;
        uzunluk = 8;
    }
}
```
#### Parameterli Constructor
Nesne oluşturuken belirli özellikleri isteyerek nesne oluşturmamızı sağlar. 
```java
public class Musteri {
    public Long id;
    public String ad;
    public String adres;
    public String telefon;
    
    //burada default contstructor ile random bir id oluşturalım ki nesne oluşturulduğunda otomatik id si olsun
    public Musteri(){
        id = new Random().nextLong(0,1500);
    }
    //Parametreli Constructor
    public Musteri(String musteriAdi, String musteriAdresi, String musteriTelefonu){
        ad = musteriAdi;
        adres = musteriAdresi;  
        telefon = musteriTelefonu;
    }
}
```
* Yukarıda oluşturduğumuz parametreli constructor oluşturlaım.
```java
public class Runner(){
    public static void main(String[] args){
        Musteri musteri1 = new Musteri("Mehmet", "Ankara", "0555");
        // görüldüğü gibi parametreli constructor kullanarak nesne oluşturduk
        //artık musteri1 ad, adres ve telefon değişkenlerine deger atadık
    }
}
```
