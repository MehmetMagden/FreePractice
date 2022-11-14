package day03_Practice;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");

        int girilenSayi = scan.nextInt();  //137
        int toplam = 0;
        int rakam = 0;

        while (girilenSayi != 0) {

            rakam = girilenSayi % 10;
            toplam = toplam + rakam;
            girilenSayi = girilenSayi / 10;
        }

        System.out.println(toplam);
    }
}
