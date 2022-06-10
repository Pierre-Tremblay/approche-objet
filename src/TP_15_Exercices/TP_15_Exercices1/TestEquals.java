package TP_15_Exercices.TP_15_Exercices1;

import TP10_Exercices.TP10_Exercices5.Continent;
import TP10_Exercices.TP10_Exercices5.Ville;

public class TestEquals extends Ville {

    public TestEquals(String nom, int nbHab, Continent continent) {
        super(nom, nbHab, continent);
    }

    public static void main(String[] args) {

        Ville v1 = new Ville("Narbonne", 53400, Continent.EUROPE);
        Ville v2 = v1;

        boolean resultat = v2.equals(v2);
//        return true;
        System.out.println(resultat);

        Ville v3 = new Ville("Narbonne", 53400,Continent.EUROPE);
        Ville v4 = new Ville("Narbonne", 53400,Continent.EUROPE);

        boolean resultat2 = v3.equals(v4);
//        return true
        System.out.println(resultat2);
//        return false
        System.out.println(v3 == v4);
    }
}
