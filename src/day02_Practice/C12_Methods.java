package day02_Practice;

import java.util.Scanner;

public class C12_Methods {
        /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi gir");
        int sayi = scan.nextInt();

        fibonacciSerisi(sayi);

    }

    public static void fibonacciSerisi (int sayi){
        int birinciSayi =0;
        int ikinciSayi =1;

        if (sayi<47){
            System.out.print(birinciSayi+"-");
            System.out.print(ikinciSayi+"-");

            for (int i = 0; i < sayi-2; i++) {
                int sayi3=birinciSayi+ikinciSayi;
                System.out.print(sayi3+"-");

                birinciSayi=ikinciSayi;
                ikinciSayi=sayi3;
            }
        }
    }

}
