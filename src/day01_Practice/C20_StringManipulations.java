package day01_Practice;

import java.util.Scanner;

public class C20_StringManipulations {

    public static void main(String[] args) {

        /*
        kullanıcıdan bir kelime alın, ilk iki harfini silin
        ilk harf g ise "g" yi silmeyin
        ikinci harf h ise "h"yi silmeyin


        input       output

        goat        gat
        photo       hoto
        ghost       ghost
        kalem       lem

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz");
        String kelam = scan.next();

        if(kelam.substring(0,2).equals("gh")){
            System.out.println(kelam);
        } else if (kelam.substring(0,1).equals("g")) {
            System.out.println( kelam.substring(0,1)+kelam.substring(2));
            
        } else if (kelam.substring(1,2).equals("h")) {
            System.out.println(kelam.substring(1));

            
        }else {
            System.out.println(kelam.substring(2));
        }


    }

}
