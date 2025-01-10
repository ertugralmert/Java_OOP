# Polimorphism
Çok biçimcilik - Polimorphism  
Bir sınıfın ya da interface in başka bir sınıf nesnesinin referansını taşıyabilmesi durumudur.  

Bu durumu anlatmak için basit sınıflar oluşturlım.  
    * inek, koyun, tavuk -> işlem yapmak için bir de Runner class oluşturlaım.  
```java
public class Inek{
    public void besle(){
        System.out.println("inekler beslendi");
    }
}
```
* koyun sınıfı  
```java
public class Koyun{
    public void besle(){
        System.out.println("koyunlar beslendi");
    }
}
```

* tavuk sınıfı  
```java
public class Tavuk(){
    public void besle(){
        System.out.println("tavuklar beslendi");
    }
}
```
* Runner class  
```java
public class Runner{
    
    public static void main(String[] args){
        Koyun koyun = new Koyun();
        Tavuk tavuk = new Tavuk();
        Inek inek = new Inek();
        koyun.besle();
        tavuk.besle();
        inek.besle();
    }
}
```
* Yukarıdaki sistemde sırayla besle() method yapıyoruz. Bunun yerine tek bir class'tan yapabilriz.  
* Bir tane parent class oluşturlaım.  
```java
public class Aga{
    public void besle(){
        
    } 
    
}
```
* şimdi extend yapalım tüm sınıfları  
```java
public class Inek extends Aga{
    
}
////
public class Koyun extends Aga{
    
}
////
public class Tavuk extends Aga{
    
}
```

* şimdi Runner class'ı yeniden tanımlayalım  
```java
public class Runner{
    public static void main(String[] args) {
        /**
         * Bir sınıf başka bir sınıftan miras almış ise miras alınan sınıf ilgili sınıfın
         * referansını taşıyabilir.
         */
        Aga aga = new Inek(); // polimorphism
        aga.besle();
        
        aga = new Koyun();
        aga.besle();
        
        aga = new Tavuk();
        aga.besle();
        /**
         * output:
         * inekler beslendi
         * koyunlar beslendi
         * tavuklar beslendi
         */
    }
}
```