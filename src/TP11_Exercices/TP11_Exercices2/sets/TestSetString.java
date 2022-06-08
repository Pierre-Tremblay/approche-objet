package TP11_Exercices.TP11_Exercices2.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        Collections.addAll(countries, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
        System.out.println(countries);

        Iterator<String> iter = countries.iterator();

        //        Rechercher la ville qui a le plus grand nombre de lettres
        int maxLongeurMot = 0;
        String plusGrandPays = "";

        for (int i = 0; i < countries.size(); i++) {
            String pays = iter.next();
            if (pays.length() > maxLongeurMot) {
                maxLongeurMot = pays.length();
                plusGrandPays = pays;
            }
        }
        System.out.println(plusGrandPays);


        //        Supprimer la ville qui a le plus grand nombre de lettres
        countries.remove(plusGrandPays);
        System.out.println(countries);


    }
}
