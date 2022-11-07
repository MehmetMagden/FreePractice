package day02_Practice;

import java.util.Scanner;

public class C10_Methods {


        /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */

    public static void main(String[] args) {

       // int cmSayi =10000000;

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cm degeriginiz");
        int cmSayi = scan.nextInt();

        System.out.println(kmVeCmHesaplayicisi(cmSayi));


    }

    public static String kmVeCmHesaplayicisi (int cmSayi){

        int km = cmSayi/100000;

        int m = cmSayi /100;

       String kagit= "km : "+km+" m : "+m;

        return kagit;


    }
}
