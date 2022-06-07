package fr.diginamic.banque.entites;

public class Compte {
    private String numCompte;
    private double soldCompte;
    private int nbOperations = 0;

    public Compte(String numCompte, int soldCompte) {
        this.numCompte = numCompte;
        this.soldCompte = soldCompte;
    }

    public int getNbOperations() {
        return nbOperations;
    }

    public void setNbOperations(int nbOperations) {
        this.nbOperations = nbOperations;
    }


    @Override
    public String toString() {
        return "Numero: " + numCompte + " -- " +
                "Nombre d’opérations:" + nbOperations +
                "Solde:  " + soldCompte;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public double getSoldCompte() {
        return soldCompte;
    }

    public void setSoldCompte(double soldCompte) {
        this.soldCompte = soldCompte;
    }

}
