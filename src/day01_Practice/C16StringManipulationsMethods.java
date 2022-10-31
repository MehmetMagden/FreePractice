package day01_Practice;

import java.util.Scanner;

public class C16StringManipulationsMethods {

    public static void main(String[] args) {

        // kullanıcıdan isim ve soy isim alıp, ismin baş harfi büyük, gerisi küçük
        // soyisimin tamamını büyük yazdıran program

    tamIsimDuzenle();

    }

    public static void tamIsimDuzenle(){
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isiminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim = scan.next();

        String duzeltilmisIsim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();

        String duzeltilmisSoyIsim = soyIsim.toUpperCase();

        String tamIsim = duzeltilmisIsim +" " + duzeltilmisSoyIsim;

        System.out.println(tamIsim);

    }
}
