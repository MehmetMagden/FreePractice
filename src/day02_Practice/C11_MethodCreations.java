package day02_Practice;

public class C11_MethodCreations {

    public static void main(String[] args) {

        /*
         * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
         * toplamini dondursun.
         *
         * Ornek
         * input : ade1r4d3
         * output : 8
         *
         * Ipucu:
         *     Character.isDigit()
         *     Integer.valueOf()
         */
		/*
            Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500

	        System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));

	        int num1= 100;
	        int num2 = 200;

	        System.out.println(String.valueOf(num1)+String.valueOf(num2));

	        */

        String str = "ade1r4d3";

        System.out.println(sayilariBulTopla(str));

    }
    public static int sayilariBulTopla(String str){
        int toplam =0;

        for (int i = 0; i <str.length() ; i++) {

            if(Character.isDigit(str.charAt(i))){

                toplam = toplam + Integer.valueOf(""+str.charAt(i));

            }
        }
        return toplam;

    }

}
