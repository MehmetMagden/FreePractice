package day01_Practice;

public class C15_StringManipulationsAndMethods {

    public static void main(String[] args) {

        // kullanıcından iki isim ve soyismini alan ve sonra bunları birleştirip yazdıran bir method yapınız

        String isim = "Mehmet";
        String soyIsim ="Can";

        isimBirlestirmeMethodu(isim,soyIsim);

    }
    public static void isimBirlestirmeMethodu (String isim, String soyIsim){

        String tamIsim = isim +" "+ soyIsim;

        System.out.println(tamIsim);



    }

}
