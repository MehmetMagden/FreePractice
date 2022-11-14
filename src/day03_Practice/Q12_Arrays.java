package day03_Practice;

public class Q12_Arrays {

    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */

    public static void main(String[] args) {

        int [][] arr = {{3,1,3}, {2,3,1} , {5,4,5} , {2,1,3}};

        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j]<min){
                    min = arr[i][j];

                }
            }
        }
        System.out.println("min deger : "+ min);
    }



}
