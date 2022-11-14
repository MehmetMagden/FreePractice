package day03_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q09_Arrays {

           /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

    public static void main(String[] args) {
        int [] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        int giris = 0;
        for (int i = 0; i <arr.length ; i++) {

            System.out.println("lütfen index "+i+" elamanını giriniz");
            giris = scan.nextInt();
            arr[i]= giris;

        }
        System.out.println(Arrays.toString(arr));

        int sayac =0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]%3==0){
                sayac++;
            }

        }
        System.out.println("uce bölünebilen sayı sayısı : "+sayac);
    }
}
