package ders28_varargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

        topla(5,6); // 2 sayı 11
        topla(5,3,8); // sayı 16
        topla(2,4,6,8); // 4 sayı 20

        // parametre sayısı degiştikçe bizden yeni method olusturmamızı ister
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("4 sayinin toplamı : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 sayinin toplamı : " + (sayi1+sayi2+sayi3));
    }

    public static void topla(int sayi1, int sayi2) {

        System.out.println("2 sayinin toplamı : " + (sayi1+sayi2));

    }
}
