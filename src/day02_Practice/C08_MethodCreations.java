package day02_Practice;

import java.util.Scanner;

public class C08_MethodCreations {

    public static void main(String[] args) {

            /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
       hesapMakinesi(); // method call

    }

    public static void hesapMakinesi (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir işlem seçin /*-+");
        char chr = scan.next().charAt(0);

        System.out.println("birinci sayı");
        int int1= scan.nextInt();
        System.out.println("ikinci sayi");
        int int2 = scan.nextInt();

        switch (chr){

            case '+':
                System.out.println(int1+int2);
                break;

            case '-':
                System.out.println(int1-int2);
                break;

            case '*':
                System.out.println(int1*int2);
                break;

            case '/':
                System.out.println(int1/int2);
                break;

            default:
                System.out.println("yanlış işlem seçimi");

        }

    }

}
