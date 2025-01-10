# Abstract class
interface -> kalıplar oluşturur. methodların gövdeleri miras alanlar tarafından yazılır.  
class -> method gövdeleri sınıf içinde yazılır, miras alanlara görev atanamaz.  
abstract class -> method gövdeleri sınıf içinde yazılır, miras alanlara görev atanabilir.  
* abstract -> method tanımları miras alana bırakılabilir ya da abstract class içinde yazılabilir.

> Dikkat normalde interface class'larda methodun gövdesi yazılmaz ancak başına "default" eklersek yazabiliriz.  

* Abstract methodlar:  
    * gövdeleri yazılmaz
    * miras alan sınıf gövdesini doldurmak zorundadır.
    * new işlemi ile nesne yaratılamaz.
    * abstract yazılan method'u miras alan tüm sınıflar yazmak zorunda  

* ortak olmasını istediklerimizin, gövdesinin yazılmasını istediklerimizn dayatarak yazdırabiliyoruz.  