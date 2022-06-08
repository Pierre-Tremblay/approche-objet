package TP11_Exercices.TP11_Exercices3;

import java.util.HashSet;

public class Pays {
    String nom;


    int nbHab;
    double pibHab;

    public Pays(String nom, int nbHab, double pibHab) {
        this.nom = nom;
        this.nbHab = nbHab;
        this.pibHab = pibHab;
    }

    public static void main(String[] args) {
        HashSet<Pays> pays = new HashSet<>();
        pays.add(new Pays("France", 67000000, 38625));
        pays.add(new Pays("Usa", 326000000, 63543.58));
        pays.add(new Pays("Allemagne", 80000000, 45723.64));
        pays.add(new Pays("UK", 60000000, 40284.64));
        pays.add(new Pays("Italie", 60000000, 31676.20));
        pays.add(new Pays("Japon", 126000000, 40113.06));
        pays.add(new Pays("Chine", 1300000000, 10500.40));
        pays.add(new Pays("Russie", 146000000, 10126.72));
        pays.add(new Pays("Inde", 12000000, 1900.40));

        System.out.println(pays);

        // Pays PIB/HAB le plus grand
        double max = 0;
        int index = 0;

        Pays payMaxPib = pays.iterator().next();
        for (Pays pay : pays) {
            if (pay.getPibHab() > payMaxPib.getPibHab()) {
                payMaxPib = pay;
            }
        }
        System.out.println(payMaxPib);

        // Pays PIB le plus grand
        long maxPib = 0l;
        Pays paysMaxPib = null;


        for (Pays pay : pays) {
            long pibTotal = (long) (pay.getNbHab() * pay.getPibHab());
            if (pibTotal > maxPib) {
                maxPib = pibTotal;
                paysMaxPib = pay;
            }
        }
        System.out.println(paysMaxPib + " avec le PIB le plus grand de " + maxPib + " $");

        // Pays PIB le plus petit

        Pays paysMinPib = null;
        for (Pays pay : pays) {
            long pibTotal = (long) (pay.getNbHab() * pay.getPibHab());
            if (pibTotal < maxPib) {
                maxPib = pibTotal;
                paysMinPib = pay;
            }
        }
        paysMinPib.setNom(paysMinPib.getNom().toUpperCase());
        System.out.println(paysMinPib + " avec le PIB le plus petit de " + maxPib + " $");

//        On supprime le pays avec le pib total le plus petit
        pays.remove(paysMinPib);
        System.out.println(pays);
    }

    @Override
    public String toString() {
        return "Pays " + nom + " Nombre d'habitant: " + nbHab + ", Pib par Habitant: " + pibHab;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHab() {
        return nbHab;
    }

    public void setNbHab(int nbHab) {
        this.nbHab = nbHab;
    }

    public double getPibHab() {
        return pibHab;
    }

    public void setPibHab(double pibHab) {
        this.pibHab = pibHab;
    }


}
