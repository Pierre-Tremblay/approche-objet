package TP_12_Exercices.TP_12_Exercices4;

import TP10_Exercices.TP10_Exercices5.Continent;
import TP10_Exercices.TP10_Exercices5.Ville;

import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {

        HashMap<String, Ville> mapVilles = new HashMap<>();

        mapVilles.put("Nice", new Ville("Nice", 343000, Continent.EUROPE));
        mapVilles.put("Carcassone", new Ville("Carcassone", 47800,Continent.EUROPE));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400,Continent.EUROPE));
        mapVilles.put("Lyon", new Ville("Lyon", 484000,Continent.EUROPE));
        mapVilles.put("Foix", new Ville("Foix", 9700,Continent.EUROPE));
        mapVilles.put("Pau", new Ville("Pau", 77200,Continent.EUROPE));
        mapVilles.put("Marseille", new Ville("Marseille", 850700,Continent.EUROPE));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600,Continent.EUROPE));

        String index = "";
        int minHabVille = mapVilles.get("Nice").getNbHab();

        for (String key : mapVilles.keySet()) {
            int nbHabVille = mapVilles.get(key).getNbHab();


            if (nbHabVille < minHabVille) {
                index = key;


            }
        }
        System.out.println(mapVilles.get(index));
        mapVilles.remove(index);
        System.out.println(mapVilles);

    }
}
