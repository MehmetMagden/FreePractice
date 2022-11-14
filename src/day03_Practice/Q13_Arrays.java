package day03_Practice;

public class Q13_Arrays {
    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */
    public static void main(String[] args) {
        String [][] arr ={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
double toplam =0;
String sayi="";

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")){
                     sayi =arr[i][j].replace("$","");
                    toplam = toplam+Double.parseDouble(sayi)*3.2;
                } else if (arr[i][j].contains("€")) {
                    sayi=arr[i][j].replace("€","");
                    toplam= toplam+Double.parseDouble(sayi)*4.2;
                }
            }

        }
        System.out.println("bütün elemanların toplam : "+toplam);



    }

}
