package day03_Practice;

import java.util.Arrays;

public class Q07_Arrays {


    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */

    public static void main(String[] args) {

        String str = "HeySiri";
        System.out.println(str.replace("Hey","Bye"));

        String [] arrStr = str.split("y");
        arrStr[0]="Bye";

        System.out.println(Arrays.toString(arrStr));

        for (int i = 0; i <arrStr.length ; i++) {

            System.out.print(arrStr[i]);

        }

    }

}
