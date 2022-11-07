package day02_Practice;

import java.util.Scanner;

public class C17_Loops {
    public static void main(String[] args) {
           /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen birden büyük bir sayi giriniz");
        int sayi = scan.nextInt();

        int total = 0;

        for (int i = 1; i <sayi ; i++) {

            int kareler = i*i;
            total = total + kareler;

        }
        System.out.println(total);



    }
}
