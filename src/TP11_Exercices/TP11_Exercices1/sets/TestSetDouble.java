package TP11_Exercices.TP11_Exercices1.sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> doubles = new HashSet<>();
        Collections.addAll(doubles, 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);
        System.out.println(doubles);

        // Affichage de la plus grande valeur
        System.out.println(Collections.max(doubles));

        // Suppression de la plus petite valeur
        doubles.remove(Collections.min(doubles));
        System.out.println(doubles);

    }
}
