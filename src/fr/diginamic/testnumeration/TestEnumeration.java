package fr.diginamic.testnumeration;

public class TestEnumeration {
    public static void main(String[] args) {

        Saison[] saisons = Saison.values();
        for (Saison saison : saisons) {
            System.out.println(saison.getLibelle());

        }

        String nom = "ETE";
        Saison saisonsEte = Saison.valueOf(nom);
        if (saisonsEte == Saison.ETE) {
            System.out.println("C'est l'été " + Saison.ETE);
        }

        String nom2 = "Hiver";
        for (Saison saison : saisons) {
            if (nom2.equals(saison.getLibelle())) {
                System.out.println(saison + " est à la place n*" + saison.getOrdre());
            }
        }
    }

}
