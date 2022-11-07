package day02_Practice;

public class C04_StringManipulations {

    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.


            String str = "   Java ogreNmek123 Cok Guzel@      ";

        String kelime =str.trim().replaceAll("\\d", "").replace("@", "");
        System.out.println(kelime);
        System.out.println(kelime.substring(0,1).toUpperCase()+kelime.substring(1).toLowerCase());


    }
}
