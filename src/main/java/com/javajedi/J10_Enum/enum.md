# Enum -> enumeration
Bunu class'lar ile anlatmam daha doğru olur.  
Unvan Enum oluşturalım.
* Enum'lar büyük harfle yazılması daha uygundur.  

```java
public enum Unvan {
    MUDUR,
    GENEL_MUDUR,
    MUHENDIS,
    HIZMETLI,
    MEMUR,
    IK
}
```
* Enum sınıfını oluşturduk bunu Personel sınıfında kullanalım  
```java
public class Personel{
    private String uuid;
    private String ad;
    private String adres;
    private String telefon;
    private Unvan unvani;
    
    //Getter setter ayarlanır hepsi için
}
```
* şimdi Runner sınınfda MEMUR ekleyelim.  
```java
public class Runner_Enum {
    public static void main(String[] args) {
        Personel personel = new Personel();
        personel.setUnvani(Unvan.MEMUR);
    }
}
```
> Çalışma mantığı -> görünen kısım String ancak arkada işlem yapan kısım Integer'dır.  
Veritabanına falan integer olarak atama yapar aslında.  
Uzun ismi -> enumeration 

Bir örnek daha yapalım.
```java
public enum Cinsiyet {
    ERKEK,
    KADIN,
    BELİRTMEK_İSTEMİYORUM
    // başka bir class açalım "UserRol" enum class oluşturalım onu da User class'a ekleyelim.
public enum UserRol {
    ADMIN,
    USER,
    GUEST,
        SUPER_USER,
        EDITOR
}    
}
```
```java
// şimdi user class'ta bu enum class kullanalım.
public class User{
    private String uuid;
    String ad;
    String username;
    String password;
    Cinsiyet cinsiyet; // enum class'ı ekledik
    UserRol rol; // enum class'ı ekledik
}
```