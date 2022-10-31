package day01_Practice;

public class C11_Nestedif {

    public static void main(String[] args) {

        // oy kullanma skalası
        // yaş 18 büyükse oy kullanabilir, küçük kullanamaz
        // yaş 50'den büyükse 2 oy kullanabilsin
        //yaş 18- 50 arası 1 oy kullanabilsin


        int yas = 12;

        if(yas>=18){

            if(yas>=50){
                System.out.println("iki oy kullanma hakkına sahipsiniz");
            }else {
                System.out.println("bir oy kullanma hakkına sahipsiniz");
            }

        }else {
            System.out.println("yas 18'den kucuk oldugu icin oy kullanamazsınız");
        }



    }
}
