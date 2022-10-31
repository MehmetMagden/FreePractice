package day01_Practice;

import java.util.Scanner;

public class C07_ifStatements {

    public static void main(String[] args) {

        // kullanici y girdiginde Yes yazdırsın
        // kullanıcı n girdiginde No yazdırsın

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen Y/N birini giriniz");
        String str = scan.next();


        if(str.equals("Y")){
            System.out.println("Yes");
        }

        if(str.equals("N")){
            System.out.println("No");
        }



    }
}
