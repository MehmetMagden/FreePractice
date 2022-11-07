package day02_Practice;

import java.util.Scanner;

public class C03_StringManipulations {

        /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz");
        String str = scan.next();

        if(str.length()%2==1 && str.length()>=3){

            System.out.println(str.charAt((str.length()-1)/2));
        }

    }

}
