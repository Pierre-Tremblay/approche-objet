package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {


        long debut = System.currentTimeMillis();
        StringBuilder nombres = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            nombres.append(i);
        }
        System.out.println(nombres);
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));


    }
}
