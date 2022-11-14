package day03_Practice;

public class Q06_Arrays {

    /*
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * lari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */

    public static void main(String[] args) {
        int toplam =0;

        int[] input= {1,2,3,4,5,6,7};

        for (int i = 0; i <input.length ; i++) {

           toplam= toplam + input[i];

        }

        int ort =toplam / input.length;
        System.out.println("girilen array'ın ortalaması : "+ort);

        for (int i = 0; i <input.length ; i++) {

            if (input[i]>ort){
                System.out.println(input[i]);
            }

        }


    }
}
