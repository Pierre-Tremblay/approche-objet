package TP10_Exercices.TP10_Exercices5;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {


    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        Collections.addAll(villes, new Ville("Nice", 343000),
                new Ville("Carcassone", 47800),
                new Ville("Narbonne", 53400),
                new Ville("Lyon", 484000),
                new Ville("Foix", 9700),
                new Ville("Pau", 77200),
                new Ville("Marseille", 850700),
                new Ville("Tarbes", 40600));
        System.out.println(villes.get(1).getNbHab());
    }
}
