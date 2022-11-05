package ders29_stringBuilder_accessModifier;

public class C04_AccessModifiers {



        String isim="Ali"; // access modifier görünmüyor, o zaman access modifier gecerlidir
                           // bu class'dan ve ders29 package'i içersindeki diger class dan kullanılabilir

        //default int sayi=10; default access midifier yazılamaz , YAZILAMAZ
        //                     Yazmaya kalkışırsanız java CTE verir

private static int sayi=10;

    public static void main(String[] args) {

        System.out.println(sayi);
        sayi=20;

        System.out.println();

    }

}
