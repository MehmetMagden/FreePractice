package day02_Practice;

public class C02_StringManipulations {


       /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

    public static void main(String[] args) {
        String name1 = "mehme";
        String name2 = "ahmet";

        if(name1.length()%2==0){

            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(3));

        }else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }



    }
}
