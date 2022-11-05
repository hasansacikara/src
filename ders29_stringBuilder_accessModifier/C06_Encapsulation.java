package ders29_stringBuilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    /*
    buyuk projelerde datayı görme (read) veya datayı degiştirme (write)
    yetkilerini birbirinden bagımsız olarak düzenlemek istenebilir

    Access modifier ile class uyelerine başka class lardan erişim sınırlandırılabilir
    ANCAK
    ulaşılabilen dataya hem okuma hem yazma yapılabilirken
    ulaşılmayan data ne okunabilir ne de degiştirilebilir

    gerçek hayatdaki ihtiyaçlar düşünüldügünde
    javaya yetki sinırlamayı uyarlamak istersek

    - Eger okuma ve yazma yetkisini birlikte vermek veya vermemek söz konusu ise
    access modifier kullanılır

    - Eger okuma ve yazma yetkileri birbirinden ayrılacaksa
    o zaman access modifier yeterli olmaz
    En capsulation ( getter ve settler method'ları ) kullanılmalıdır
     */

    // get ve set daha önceki java objelerinde karşımıza çıkmıştı

    public static void main(String[] args) {

        List<Integer> sayılar= new ArrayList<>();

        sayılar.add(2);
        sayılar.add(3);
        sayılar.add(5);

       // sayılar.get(1)=10; get okumaya izin var ama deger atamaya (yazmaya) izin yok

        //System.out.println(sayılar.set;(1)); set varsa MUTLAKA deger atamalıyız

    }


}
