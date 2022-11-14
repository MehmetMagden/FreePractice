package day03_Practice;

import java.util.Scanner;

public class Q03_DoWhile {


       /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

    public static void main(String[] args) {

        String giris ="";
        do {
            System.out.println("Program Çalışıyor");
            Scanner scan = new Scanner(System.in);
            System.out.println("lütfen bir giriş yapınız");
            giris =scan.next();

        }while ( !giris.equals("x") );

        System.out.println("Program Bitti");
    }




}
