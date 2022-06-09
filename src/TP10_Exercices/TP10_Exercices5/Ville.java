package TP10_Exercices.TP10_Exercices5;

import java.util.Objects;

public class Ville implements Comparable<Ville>{
    public String nom;
    public int nbHab;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return nbHab == ville.nbHab && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHab);
    }

    public Ville(String nom, int nbHab) {
        this.nom = nom;
        this.nbHab = nbHab;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + " Nombre d'habitant : " + nbHab;
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

    @Override
    public int compareTo(Ville o) {
//        return this.getNom().compareTo(o.getNom());
        return o.getNbHab()-this.getNbHab();
//        return Long.compare(this.getNbHab(), o.getNbHab());

    }
}
