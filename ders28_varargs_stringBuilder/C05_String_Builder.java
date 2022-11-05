package ders28_varargs_stringBuilder;

public class C05_String_Builder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("java candır.");

        System.out.println(sb.capacity()); // 16 + 12 = 28
        System.out.println(sb.length()); // 12

        System.out.println(sb.reverse()); // .ridnac avaj  // reverse methodu ismi stringi tersine çeviriyor
        sb.reverse(); // java candır

        sb.replace(0,4, "bmw candır");

        System.out.println(sb); // kelimenin index ine göre yazdırdı // bmw candır

        sb.insert(18, "bu bir yalandır"); // bmw candır candır.bu bir yalandır
        System.out.println(sb);


        String str= "java cok güzel";

        sb.insert(21,str, 9, 14);

        System.out.println(sb); // bmw candır candır.bu güzelbir yalandır




    }
}
