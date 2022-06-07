package utils;

public class ConversionNombre {

    int numberMax = 0;


    public void convertMethod(String chaine) {
        int number = Integer.parseInt(chaine);
        System.out.println(number);
    }


    public void compareNumber(int a, int b) {
        numberMax = Integer.max(a,b);
        System.out.println(numberMax);


    }

}
