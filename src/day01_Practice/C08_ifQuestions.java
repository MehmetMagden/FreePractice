package day01_Practice;

public class C08_ifQuestions {

    public static void main(String[] args) {

        /*
        Not hesaplayıcı
        90 -100 >  A
        80 -89 >  B
        70 -79 >  C
        60 -69 >  D
        0 -59 >  F
         */

        int not = 75;

        if(not>=90){
            System.out.println("A");
        }
        else if(not>=80){
            System.out.println("B");
        }
        else if(not>=70){
            System.out.println("C");
        }
        else if(not>=60){
            System.out.println("D");
        }
        else if(not>=0){
            System.out.println("F");
        }



    }

}
