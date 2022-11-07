package day02_Practice;

public class C18_Loops {

        /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {
        int row = 3;
        int column =5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

}
