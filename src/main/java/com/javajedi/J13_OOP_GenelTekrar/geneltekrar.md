# Genel Tekrar
Bu rada bazı package içleri boş sadece genel olarak olabilecek package isimlerini girdim.  
Burada ileride göreceğimiz ArrayList ile ilgili ufak bir çalışma yapacağız.  
Tanımı aşağıdaki gibi olacak.
```java
public class Runner {
    public static void main(String[] args){
        // bir dizi tanımlayacağız.
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Mert");
        isimler.add("Canan");
        isimler.get(0); // değer okuma
        isimler.remove(0); // deger silme
        isimler.size(); // deger sayısı
        
        // Array konusundan daha pratik ancak çalışma mantığı tamamen aynı. 
        //Control tuşuna basarak ArrayList tıklarsanız methodları görebilirsiniz.
    }
}
```
* repository -> bilgi istiflemek.
* 