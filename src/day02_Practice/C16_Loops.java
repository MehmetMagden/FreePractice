package day02_Practice;

import java.util.Scanner;

public class C16_Loops {

      /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!
            */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        String girilenHarf = scan.next();

        String sesliHarfler = "aeiou";
        String sessizHarfler = "bcdfghjklmnprstvwyz";
        String sayilar = "1234567890";

        if (girilenHarf.length()>1){
            System.out.println("Birden fazla harf girdiniz");
        }
        if (sayilar.contains(girilenHarf)){
            System.out.println("sayi girdiniz");
        }

        for (int i = 0; i < sesliHarfler.length(); i++) {
            if (girilenHarf.equals(sesliHarfler.substring(i,i+1))){
                System.out.println("Sesli Harf girdiniz");
            }

        }
        for (int i = 0; i <sessizHarfler.length() ; i++) {
            if (girilenHarf.equals(sessizHarfler.substring(i,i+1))){
                System.out.println("Sessiz Harf Girdiniz");

            }

        }




    }
}
