package day02_Practice;

public class C09_MethodsForLoopOgreninceTekrarBakacagız {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {
        String str = "aabbcccccddddaaa";
        System.out.println(essizHarfleriBul(str));
    }
    public static String essizHarfleriBul(String str){

    String str2 ="";
        for (int i = 0; i < str.length(); i++) {

            if(!str2.contains(str.substring(i,i+1))){

                str2= str2 +str.substring(i,i+1);
            }
        }
        return str2;
    }
}
