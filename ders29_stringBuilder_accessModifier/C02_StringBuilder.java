package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candır");

        System.out.println(sb1.reverse()); // rıdnaC avaJ

        System.out.println("Tersini yazdırdıktan sonra sb1: " + sb1);

        System.out.println(sb1.insert(0, ".")); // .rıdnaC avaJ

        System.out.println(sb1);

        sb1.reverse();

        StringBuilder sb2= new StringBuilder( "Java Candır");
        String str="Java Candır.";

        System.out.println(sb1==sb2); // false içerik aynı olsa bile false verir

        System.out.println(sb1==sb1); // true  sadece bir sb kendisi ile karşılaştırılırsa true verir
       // System.out.println(sb1==str);
        // farklı 2 data türü == ile karşılaştırılamaz

        System.out.println(sb1.equals(sb2)); // false  içerik aynı olsa bile false verir
        System.out.println(sb1.equals(sb1)); //   true  sadece bir sb kendisi ile karşılaştırılırsa true verir
        System.out.println(sb1.equals(str)); // false CTE vermez fakat sonuç herzaman false dur

        System.out.println(sb1.compareTo(sb2)); // 1
        StringBuilder sb3= new StringBuilder("jaka kandır");
        System.out.println(sb1.compareTo(sb3)); // 2

        /*
        CompareTo sadece tamamen aynı mı yoksa farklı mı sorusunun cevabını verir
        tamamen aynı ise ==> 0 döner
        farklılık varsa ==> ilk farklı harfi buldugunda, farklı harflerin arasında kaç harf oldugunu verir
         */

    }
}
