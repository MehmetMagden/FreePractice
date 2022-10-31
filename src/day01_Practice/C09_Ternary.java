package day01_Practice;

public class C09_Ternary {
    public static void main(String[] args) {

        // ürün 50 tl altı ise "ucuz", üstü ise "pahalı" yazsın

        int urunFiyati = 25;

        System.out.println(    (urunFiyati>50)  ? ("pahali") : ("ucuz") );


        //fiyat 10'dan az ise ucuz, 10 ile 20 arasında ise normal, 20'den fazla ise pahalı

        int urunFiyat2=28;


        System.out.println( (urunFiyat2<10)   ?   ("ucuz")   :   (  (urunFiyat2<20) ? ("normal") : ( "pahalı")  ) );




    }
}
