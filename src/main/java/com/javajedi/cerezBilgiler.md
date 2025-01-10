# Notes
* Mesela bir değerimiz olsun bunu başka bir değere atamak istiyoruz diyelim.  
```java
String sayi = 44;
int sayi = Integer.parseInt(sayi);
// görüldüğü üzere String verilen bir ifadeyi integer olarak değiştirdik.
```
* Bir kod zamanla ortadan kalkabilir. Bunu depricated olarak tnaımlarız ve herkes buna göre  
kendini ayarlar.  
```java
@Deprecated(since ="20")
double getTutar(){
    throw new RuntimeException("bu method artık kullanılmamaktadır.");
        }
```