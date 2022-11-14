package day03_Practice;

import java.util.Scanner;

public class Q04_DoWhile {

        /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."

		 kullanıcıdan bir kelime girmesini isteyin. Girilen kelimenin karakter sayısı tek ise ve 3 ten fazla ise
		 kelimenin ortasındaki harfi yazdırın

		 çift sayı ise "yanlış kelime girdiniz" yazsın


		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String kelime ="";


        do {

            System.out.println("lütfen bir kelime giriniz");
            kelime= scan.next();

            if(kelime.length()<3){
                System.out.println("girilen kelime 3 karakter veya daha fazla içermeli");
            }
            if (kelime.length()%2!=1){
                System.out.println("girilen kelimedeki harf sayısı tek olmalı");
            }

            if (kelime.length()<3 && kelime.length()%2!=1){
                System.out.println("yanlış kelime girdiniz");
            }
            if(kelime.length()>=3 && kelime.length()%2==1){

                System.out.println(kelime.charAt((kelime.length()-1)/2));
            }

        }while (kelime.length()<3 || kelime.length()%2!=1);



    }
}
