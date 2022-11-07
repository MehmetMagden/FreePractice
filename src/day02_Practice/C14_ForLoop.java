package day02_Practice;

public class C14_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


    public static void main(String[] args) {
        for (int i = 0; i <=255 ; i++) {

            char karakter = (char)i;

            System.out.println(i+" char degeri : "+ karakter);

        }
    }




}
