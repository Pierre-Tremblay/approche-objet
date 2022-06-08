package TP_12_Exercices.TP_12_Exercice2;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap {
    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
//TODO Développements à réaliser ci-dessous
        mapVilles.put(49, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        for (Map.Entry<Integer, String> entry : mapVilles.entrySet()) {
            Integer key = entry.getKey();

            System.out.println("Clé: " + key);
        }

        for (Map.Entry<Integer, String> entry : mapVilles.entrySet()) {
            String value = entry.getValue();
            System.out.println("Valeur: " + value);
        }
        System.out.println(mapVilles.size());


    }
}

