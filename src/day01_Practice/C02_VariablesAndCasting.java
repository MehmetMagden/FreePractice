package day01_Practice;

public class C02_VariablesAndCasting {

    public static void main(String[] args) {


        int intVar = 3;



        double doubleVar = 4.0;


        //doubleVar = intVar;

        System.out.println(doubleVar);

        intVar = (int) doubleVar;

        System.out.println("intVar = " + intVar);


    }

}
