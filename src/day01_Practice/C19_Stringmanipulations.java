package day01_Practice;

import java.util.Locale;
import java.util.Scanner;

public class C19_Stringmanipulations {
    public static void main(String[] args) {

        /*

        kullanıcıdan 4 kelime isteyin

        cümle düzenine göre yazdırın

       Örnek: Cümle düzeni bu şekilde.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen birinci kelimeyi giriniz");
        String kelime1= scan.next();

        System.out.println("lütfen ikinci kelimeyi giriniz");
        String kelime2= scan.next();

        System.out.println("lütfen üçüncü kelimeyi giriniz");
        String kelime3= scan.next();

        System.out.println("lütfen dördüncü kelimeyi giriniz");
        String kelime4= scan.next();

        String duzenlenmisKelime1 = kelime1.substring(0,1).toUpperCase()+ kelime1.substring(1).toLowerCase();
        String duzenlenmisKelime2 = kelime2.toLowerCase();
        String duzenlenmisKelime3 = kelime3.toLowerCase();
        String duzenlenmisKelime4 = kelime4.toLowerCase()+".";

        System.out.println(duzenlenmisKelime1+" "+duzenlenmisKelime2+" "+duzenlenmisKelime3+" "+ duzenlenmisKelime4);




    }
}
