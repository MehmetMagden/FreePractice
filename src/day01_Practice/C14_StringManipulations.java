package day01_Practice;

import java.util.Scanner;

public class C14_StringManipulations {

    public static void main(String[] args) {

        // kullanıcıdan ismini ve soy ismin sorun, bütün ismini büyük harf ile yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lütfen soy isminizi giriniz");
        String soyIsim = scan.next();


        String tamIsim = isim +" "+ soyIsim;
        System.out.println("tamIsim.toUpperCase() = " + tamIsim.toUpperCase());  // ALİ VELİ CAN
        tamIsim= tamIsim.toUpperCase();

        System.out.println("tamIsim : " + tamIsim);


    }
}
