package TP_13_Exercices.TP_13_Exercices3;

import TP10_Exercices.TP10_Exercices5.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville o1, Ville o2) {
        return o1.getNbHab()-o2.getNbHab();
    }
}
