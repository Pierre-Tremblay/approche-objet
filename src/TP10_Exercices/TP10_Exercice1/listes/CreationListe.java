package TP10_Exercices.TP10_Exercice1.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++)
            arraylist.add(i);
        System.out.println(arraylist.size());
    }
}
