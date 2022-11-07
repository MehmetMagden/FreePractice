package day02_Practice;

import java.util.Scanner;

public class C05_StringManipulations {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim1= scan.next();
        System.out.println("lütfen soy isminizi giriniz");
        String soyIsim = scan.next();

        if( isim1.length()>soyIsim.length()){
            System.out.println(isim1+" soyIsminizden daha uzun");
        } else if (soyIsim.length()>isim1.length()) {
            System.out.println(soyIsim+ " isminizden daha uzun");

        }else {

            System.out.println("aynı uzunluktalar");
        }

    }

}
