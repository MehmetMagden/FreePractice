package day03_Practice;

public class Q11_Arrays {

    /*
     * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
     * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
     *
     * method ile yapınız

     */
    public static void main(String[] args) {
        int[][] arr1 = {{0, 2, -1}, {3, 8, 9}, {7}};
        int[][] arr2 = {{-7, 6, -9}, {0, 12}, {19}};
        int genelToplam = 0;

        genelToplam = genelToplam + arrayElemanToplaminiBul(arr1) + arrayElemanToplaminiBul(arr2);
        System.out.println("iki arrayin elemanlarının hepsinin toplamı : " + genelToplam);
    }

    private static int arrayElemanToplaminiBul(int[][] arr1) {
        int toplam = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam = toplam + arr1[i][j];
            }
        }
        return toplam;
    }
}
