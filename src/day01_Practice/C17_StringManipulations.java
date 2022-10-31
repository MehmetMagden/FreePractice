package day01_Practice;

public class C17_StringManipulations {

    public static void main(String[] args) {

        /*
        Aşağıdaki değerleri toplayabilen bir program yapınız

        12.34$
        32.23$


            /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
		 	 */


         String deger1 = "12.34$";
         String deger2 = "32.23$";

         String duzeltilmisDeger1 = deger1.replaceAll("\\D","");
        System.out.println("duzeltilmisDeger1 = " + duzeltilmisDeger1);

        String duzeltilmisDeger2 =deger2.replaceAll("\\D","");
        System.out.println("duzeltilmisDeger2 = " + duzeltilmisDeger2);

        String toplam = duzeltilmisDeger1 + duzeltilmisDeger2;
        System.out.println("toplam = " + toplam);

        double sayi1= Double.parseDouble(duzeltilmisDeger1)/100;
        double sayi2= Double.parseDouble(duzeltilmisDeger2)/100;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        double toplamDeger = sayi1+sayi2;
        System.out.println("toplamDeger = " + toplamDeger);


    }



}
