package day01_Practice;

import java.util.Scanner;

public class C13_switchCase {


    public static void main(String[] args) {

        /*
        kullanıcıdan bir harf alın ve harfe göre

        A >>   "Java çok kolay"
        B >>   "Java Çok Eğlenceli"
        C >>   "Javayı çok seviyorum"


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");

        char secenek = scan.next().charAt(0);

        switch (secenek){

            case 'A' :
            case 'a' :
                System.out.println("Java Çok Kolay");
                break;

            case 'B' :
                System.out.println("Java çok eğlenceli");
                break;

            case 'C' :
                System.out.println("Javayı çok seviyorum");
                break;
            default:
                System.out.println( "lütfen A,B,C harflerinigiriniz");


        }







    }

}
