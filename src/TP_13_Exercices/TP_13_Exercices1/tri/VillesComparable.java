package TP_13_Exercices.TP_13_Exercices1.tri;

import TP10_Exercices.TP10_Exercices5.Continent;
import TP10_Exercices.TP10_Exercices5.Ville;
import TP_13_Exercices.TP_13_Exercices3.ComparatorHabitant;
import TP_13_Exercices.TP_13_Exercices3.ComparatorNom;

import java.util.ArrayList;
import java.util.Collections;

public class VillesComparable {
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
        System.out.println(villes);
        Collections.sort(villes);
        System.out.println(villes);

        ComparatorHabitant comparatorHabitant = new ComparatorHabitant();
        ComparatorNom comparatorNom =new ComparatorNom();
        villes.sort(comparatorHabitant);
        System.out.println(villes);
        villes.sort(comparatorNom);
        System.out.println(villes);





    }

}
