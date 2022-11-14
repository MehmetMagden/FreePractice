package day03_Practice;

public class Q02_While {

    /*
             Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
     */


    public static void main(String[] args) {

        int girilenSayi = 45;

        for (int i = 0; i <=girilenSayi ; i++) {

            if (i%2!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.println("------------------------");
        int loopSayisi =0;

        while (loopSayisi<=girilenSayi){

            if(loopSayisi%2!=0){
                System.out.print(loopSayisi+" ");

            }
            loopSayisi++;
        }
    }
}
