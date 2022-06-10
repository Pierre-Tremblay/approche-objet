package TP10_Exercices.TP10_Exercices5;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille extends Ville{


    public TestVille(String nom, int nbHab, Continent continent) {
        super(nom, nbHab, continent);
    }

    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        Collections.addAll(villes, new Ville("Nice", 343000, Continent.EUROPE),
                new Ville("Carcassone", 47800,Continent.EUROPE),
                new Ville("Narbonne", 53400,Continent.EUROPE),
                new Ville("Lyon", 484000,Continent.EUROPE),
                new Ville("Foix", 9700,Continent.EUROPE),
                new Ville("Pau", 77200,Continent.EUROPE),
                new Ville("Marseille", 850700,Continent.EUROPE),
                new Ville("Tarbes", 40600,Continent.EUROPE));
        System.out.println(villes.get(1).getNbHab());
    }
}
