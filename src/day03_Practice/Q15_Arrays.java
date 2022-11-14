
package day03_Practice;

import java.util.Arrays;

public class Q15_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        System.out.println(str);
        str= str.replace(" ","");
        System.out.println(str);

        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        System.out.println("bosluklular haric karakter sayısı : "+arr.length);

    }
}
