package day02_Practice;

public class C01_StringManipulationsContains {

    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {

        String str = "xyaz";

        if(str.contains("xyz")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }


}
