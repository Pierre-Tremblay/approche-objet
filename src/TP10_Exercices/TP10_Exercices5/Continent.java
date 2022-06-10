package TP10_Exercices.TP10_Exercices5;

public enum Continent {
    EUROPE("Europe"),
    AFRIQUE("Afrique"),
    ASIE("Asie"),
    AMERIQUE("Emérique"),
    OCEANIE("Oceanie");

    private String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
