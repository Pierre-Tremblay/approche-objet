package Gestion_Salaires;

public class Employe extends Personne {
    private static final int nbJourTravailleParAn = 212;
    private static final int nbHeureTravailleParAn = 1607;
    private static final double tauxDuCa = 0.05;
    private static final double chargesSalariales = 0.76;


    private String matricule;
    private CoordonneeContactPro coordonneeContactPro;
    private double salaire;

    public Employe(String matricule, CoordonneeContactPro coordonneeContactPro, double salaire) {
        this.matricule = matricule;
        this.coordonneeContactPro = coordonneeContactPro;
        this.salaire = salaire;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public CoordonneeContactPro getCoordonneeContactPro() {
        return coordonneeContactPro;
    }

    public void setCoordonneeContactPro(CoordonneeContactPro coordonneeContactPro) {
        this.coordonneeContactPro = coordonneeContactPro;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double calculerCadre(double txJournalierCadre) {
        return nbJourTravailleParAn * txJournalierCadre;

    }

    public double calculerTechnicien(double txHoraireTech) {
        return nbHeureTravailleParAn * txHoraireTech;
    }

    public double calculerCommercial(double caAnnePrecedente) {
        return caAnnePrecedente * (caAnnePrecedente * tauxDuCa);
    }

    public double calculerSalaireNet() {
        return chargesSalariales;
    }
}
