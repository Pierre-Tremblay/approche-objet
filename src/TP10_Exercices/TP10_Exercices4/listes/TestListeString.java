package TP10_Exercices.TP10_Exercices4.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> villes = new ArrayList<String>();
        Collections.addAll(villes, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

//        Rechercher la ville qui a le plus grand nombre de lettres
        int maxLongeurMot = 0;
        int index = 0;

        for (int i = 0; i < villes.size(); i++) {

            if (villes.get(i).length() > maxLongeurMot) {
                index = i;
                maxLongeurMot = villes.get(i).length();

            }
        }
        System.out.println(villes.get(index));

//        Les noms de villes en majuscules
        villes.replaceAll(String::toUpperCase);
        System.out.println(villes);

        // Supprimer les villes commencant par la lettre N
        villes.removeIf(v -> v.startsWith("N"));
        System.out.println(villes);

    }
}
