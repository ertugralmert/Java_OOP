# Interface
Bir sınıfın işlevsellik dışında kalan genel kapsamlı tanımlamaları  
olarak ifade edilebilir. Bir sözleşmeye benzetebiliriz. Genel çerçevesi  
çizilmiş matbu bir evrak şeklinde düşünülebilir.  

* Interface'in gerekliliğini örnek vererek açıklayayım.  

```java
public class MusteriRepository{
    // müşterinin kayıt edilme işlemi örneğinden gidelim.
    // bir firmada düşünün herkesin kaydetme şekli farklı olabilir. aşağıdaki gibi
    public void save(){
        
    }
    public void saveMusteri(){
        
    }
    public void SAVE(){
        
    }
    public void musteriKayit(){
        
    }
    // yukaridaki kayıt işlemi örnekleri çoğaltılabilir.
    // görüldüğünü üzere aşırı kalabalık ve farklı kaydetme methodları -> çok saçma!!!
    // bu sadece bir kaydet methodu düşünün başka methodları... burası çöplük olur
    
}
```
* Yukarıdaki durumun çözümü Interface'dır.
* örnek ile açıklayalım.  
> Dikkat !!! Interface'lerde methodların body'leri olmaz.  
 
> Dikkat !!! Interface'lerde method şablonu oluşturulur. Değişken tanımı yapılmaz.  

> Dikkat !!! Interface'lerde methodların gövdeleri yazılır!!!  

> Dikkat !!! Interface'ler extends olmaz. Interface'ler implement edilir.  

> Dikkat !!! // Java'da birden fazla extends olmaz ancak birden fazla implement olur....  
> SatisRepository extends BaseRepository implements Repository,BaseQueryRepositry şeklinde olur.
```java
public interface Repository(){
    // görüldüğü üzere interface class oluşturuldu. Adı Repository
    void save();
    void deleteById();
    
}
```

* implement edelim  
```java
public class UrunRepository implements Repository{
    // implement yapıldığında tüm methodlar implement edilmelidir.
    // implement edilen tüm methodlar aynen kullanılmalıdır. 
    @Override
    public void save() {
        
    }
    
    @Override
    public void deleteById() {
        
    }
}
```
 
> Dikkat !!!! Interface'ler new keyword'ü ile nesne yaratamazlar. Çünkü methodların gövdeleri  yoktur.  
Bu nedenle new işlemi olmaz. Interface'den miras alan sınıfları kullanarak onların referanslarını atarsınız.  
> 