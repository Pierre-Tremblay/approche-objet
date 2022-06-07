package fr.diginamic.banque.entites;

public class Compte {
 private int numCompte;
 private double soldCompte;

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", soldCompte=" + soldCompte +
                '}';
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSoldCompte() {
        return soldCompte;
    }

    public void setSoldCompte(double soldCompte) {
        this.soldCompte = soldCompte;
    }

    public Compte(int numCompte, int soldCompte) {
        this.numCompte = numCompte;
        this.soldCompte = soldCompte;
    }

}
