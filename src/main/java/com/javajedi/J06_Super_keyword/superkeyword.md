# super
"super" -> keyword olarak geçer  
miras (inheritance) aldığmız parent class'ın constructor'ını çağırmak için kullanılır.  
super() şeklinde kullanır isek defaul constructor çalışır  
super(alan, alan....) şeklinde kullanılırsak parametreli constructor çalışır.  
> Dikkat !!! super() yazsakta yazmasakta tüm constructor'ların içinde default olarak vardır.  
> Constructor içinde super() den önce asla ama asla başka kod yazılamaz!!!!  

* örnek ile açıklayalım.  

```java
public class Arac {
    // Parent bir class oluşturalım. 
    int vites;
    int hiz;
    /**
     * Normalde parametreli bir constructor versek ve araba gibi bir sınıfta çalıştırsak
     * hata alırız çünkü default constructor olmadığından. Bunun yerine super() yazmamız lazım.
     * Yani default constructor veya parametreli constructor seçmek için
     * Bir tane Araba Class oluşturalım. daha net anlaşılırı.
     */
    
    // önce parametresiz constructor tanımlayalım
    public Arac(){
        System.out.println("Araç constructor calisti");
    }
    // Parametreli constructor tanımlayalım
    public Arac(int vites){
        this.vites = vites;
    }
}
```
```java

public class Araba extends Arac {
    // Arac class'ını extend ettik yani miras aldık.
    public Araba(){
        super();
        System.out.println("Araba constructor calisti");
    }
    // Yukarıdaki şekilde yaptığımızda default yani paremetresiz constructor calısır.
    public Araba(){
        super(4); // vites isteyen parametreli constructor calısır
        System.out.println("Araba constructor calisti");
        // Bu şekilde ise parametreli Arac constructor çağırmış olduk
    }
}
```
> Ne zaman kullanılara örnek. Araç sınıfında default constructor yok diyelim.  
Sadece parametreli vites isteyen constructor olsun. super() olmadan Araba class'ında  
tanımlama yapamazsın hata verir. Ancak sen super(4); yazarak bunu çözebilirsin.  
Yani parametre vererek default constructor'ı ezmiş olursun.

> Dikkat !!! Bir sınıf miras almasa dahi super() keyword'üne sahiptir. Neden ?  
Her şey object sınıfından türetilmiştir. Tüm sınıflar object sınıfın child'larıdır.  
ondan extend olurlar....  

* Gerekli olduğunda kullanılır.
* Default constructor devre dışı bırakıldığında kullanım ortaya çıkar.
