package ders28_varargs_stringBuilder;

public class C04_String_Builder {

    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder(7);

        // Bu kod yazıldıgında java 7 karakter olabilecek bir SB olusturur.

        System.out.println(sb.capacity()); // 7
        System.out.println(sb.length()); //0  hiç bir deger atanmadıgı için için 0

        sb.append("java");

        System.out.println(sb);
        System.out.println(sb.capacity()); // 7
        System.out.println(sb.length());  // 4

        sb.append(" güzeldir. ");
        System.out.println(sb.capacity()); // 7 *2 +2 = 16
        System.out.println(sb.length());  // 14

        sb.append(" ona ne şüphe");
        System.out.println(sb);
        System.out.println(sb.capacity()); // 16 *2 +2 =34
        System.out.println(sb.length());  // 28

        // kapa site ve length'i eşitlemek istersek

        sb.toString();





    }
}
