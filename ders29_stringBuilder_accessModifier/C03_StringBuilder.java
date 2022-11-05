package ders29_stringBuilder_accessModifier;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java ne kadar güzel");

        System.out.println(sb.substring(4)); // ne kadar güzel

        System.out.println(sb); // Java ne kadar güzel

       // sb=sb.substring(0,4) eşitligin solu StringBuilder , sagı ise String
        //                     java non-primitive datalarda casting yapmaz yani çevirmez
        // aynı not Integer, Byte ve Short gibi sayı barındırıan non-primitivler içinde geçerlidir

        // sb güzel kelimesi içeriyor mu?
        /*
          StringBuilder da olmayan, String class ında bulunan method ları kullanmak isterseniz
          önce toString() ile String e çevirip, sonra String manipulation yapılabilir
         */

        System.out.println(sb.toString().contains("güzel")); // true

        sb.setCharAt(5, 'N');
        System.out.println(sb);
    }
}
