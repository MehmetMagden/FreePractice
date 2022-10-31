package day01_Practice;

public class C10_NestedIfStatements {



    // hayvan Mekanı >< 15 yaş üstü girebilir, Kedi sevenler sağa, Köpek sevenler sola gitsin

    public static void main(String[] args) {


        int yas = 19;
        String sevdigiHayvan = "kedi";


        if( yas>15){

            if(sevdigiHayvan.equals("kedi")){

                System.out.println("lütfen sağ taraftan ilerleyin");
                System.out.println("yanan ışıkları takip ediniz");
            } else if (sevdigiHayvan.equals("köpek")) {

                System.out.println("lütfen sol taraftan ilerleyin");

            }

        }

    }









}
