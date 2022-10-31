package day01_Practice;

public class C12_switchCase {

    public static void main(String[] args) {

        /*

        pazartesi salı      : Java Dersi
        Perşembe Cuma       : Selenium
        Çarşamba cumartesi : SQL Dersi

        diğer hallerde      : izin günü

         */

        String gun = "pazartesi";


        switch (gun){

            case "pazartesi":
                System.out.println("pazartesi java günü");
                break;

            case "sali"  :
                System.out.println(" salı Java Dersi");
                break;

            case "persembe":
            case "cuma":
                System.out.println("Selenium Dersi");
                break;

            case "carsamba" :
            case "cumartesi":
                System.out.println("SQL Dersi");
                break;

            default:
                System.out.println("izin günü");

        }



    }
}
