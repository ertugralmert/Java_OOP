# Encapsulation
Bazen değişkenlere erişim kısıtlaması gerekiyor.
* ilk olarak "private" ekleriz
* kısıtlı erişim sağlarız. 
* private olan değişkene sınıf içinden rahatlıkla erişebiliriz.

* örnek ile açıklayalım

```java
public class UygulamaConfig{
    private String url;
    
    //şimdi encapsulation uyguladık private yaptık ve url değişimine bilgiler gireceğiz.
    public void setUrl(String urlAdresi){
        System.out.println("eski değer: "+ url);
        System.out.println("yeni değer: "+ urlAdresi);
        System.out.println("Değişme zamanı: "+ System.currentTimeMillis());
        url = urlAdresi;
    }
    // private olduğu için okuma işlemi için getUrl() method tanımlayabiliriz.
    public String getUrl(){
        return url;
    }
}
```
* Yukarıda sınıftan url dğeişimi için setUrl() method kullanmamız lazım.  
  * bu kullanımda değişiklikleri görebiliriz ve kimse kafasına göre değişim sağlayamaz.
```java
public class Runner {
public static void main(String[] args){
    UygulamaConfig config = new UygulamaConfig();
    config.setUrl("http://localhost:8080");
    System.out.println(config.url);
}
}
```
> Entity, model class'larda yani varlıklarda kapsülleme yaparız.  
* DTO -> Data Transfer Object 
* POJO -> Plain Old Java Object 
    * En basit java sınıfı olarak geçer. temel sınıf tanımlamasıdır.
    * DB'lerde Mapping yaparken WEb üzerinden verileri alırken(Request) ya da Response'ta

> Toplu olarak encapsulation yapmak için varlık sınıfta IDE üzerinde sağ tıklayıp Generate diyip  
    getter ve setter methodlarını oluşturabiliriz.  

> Constructor için yine "generate" constructor oluşturabiliriz.   

* Generate yaptığımız getter ve setter methodlarında "this" eklenir.
    * this. değişkenAdı = değişkenAdı; buradaki this class içindeki değişkeni temsil eder.
    * bu sınıfın instance'ını temsil eder. 
    * this() constructor'i temsil eder.