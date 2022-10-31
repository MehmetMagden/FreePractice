package day01_Practice;

import java.util.Scanner;

public class C18_StringManipulations {

    public static void main(String[] args) {

        /*

        kullanıcıdan bir kelime isteyin, eğer kelime üç veya üç'ten fazla harften oluşuyorsa, ilk iki harfi 3 kere yazdırın,
        diğer durumda  kelimeyi yazdırın

        ali >> alalal
        al >> al

         */


        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir kelime giriniz");
        String kelam = scan.next();

        if(kelam.length()>=3){

            System.out.print(kelam.substring(0,2));
            System.out.print(kelam.substring(0,2));
            System.out.print(kelam.substring(0,2));


        }else {

            System.out.println(kelam);
        }




    }
}
