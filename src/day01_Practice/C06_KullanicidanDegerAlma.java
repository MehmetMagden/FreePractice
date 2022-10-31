package day01_Practice;

import java.util.Scanner;

public class C06_KullanicidanDegerAlma {

    public static void main(String[] args) {

        //kullanicidan iki sayi aliniz, toplamlarini yazidiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir sayi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("lütfen bir sayi daha giriniz");
        int sayi2 = scan.nextInt();


        int toplam = sayi1+sayi2;

        System.out.println("girilen sayilarin toplami = "+toplam);



    }
}
