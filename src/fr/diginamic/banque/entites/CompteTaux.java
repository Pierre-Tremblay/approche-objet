package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxRemuneration;

    public CompteTaux(String numCompte, int soldCompte, double tauxRemuneration) {
        super(numCompte, soldCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Taux: " + tauxRemuneration + "%";
    }
}
