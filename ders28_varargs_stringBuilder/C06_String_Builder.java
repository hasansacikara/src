package ders28_varargs_stringBuilder;

public class C06_String_Builder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Güzeldir");

        System.out.println(sb.indexOf("a"));  // 1

        System.out.println(sb.indexOf("a", 2)); // 3
    }

}
