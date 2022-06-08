package TP10_Exercices.TP10_Exercice3.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> nombres = new ArrayList<Integer>();
        Collections.addAll(nombres, -1, 5, 7, 3, -2, 4, 8, 5);

//        Affichage du tableau
        System.out.println(nombres);

//        Affichage de la taille du tableau
        System.out.println(nombres.size());

//        Affichage du nombre max
        int max = Collections.max(nombres);
        System.out.println(max);

//        Affichage et suppression du nombre min
        nombres.remove(Collections.min(nombres));
        System.out.println(nombres);

//        Convertion des négatifs en positifs
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i) < 0) {
                nombres.set(i, -nombres.get(i));
            }
        }

        System.out.println(nombres);
    }

}
