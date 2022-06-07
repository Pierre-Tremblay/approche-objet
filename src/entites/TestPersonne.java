package entites;

public class TestPersonne {
    public static void main(String[] args) {
        Personne pers1 = new Personne("Moulin", "Jean", new AdressePostale(25, "rue la place", 44250, "Nantes"));
        Personne pers2 = new Personne("Dupont", "Marc", new AdressePostale(5, "rue la cours", 44150, "Ancenis"));


//        Affichage du nom et prenom
        pers1.upperCaseName(pers1.getNom());

//        Modification du nom
        pers1.setNom("Blanc");

//        Récuperation du nouveau nom
        System.out.println(pers1.getNom());

//        Modification de chaque élément de l'adresse
        pers1.setAdressePostale(new AdressePostale(15, "rue de la bataille", 49250, "Angers"));

//        Récupération de chaque élément de l 'adresse
        System.out.print(pers1.getAdressePostale().getNumRue() + " ");
        System.out.print(pers1.getAdressePostale().getRue() + " ");
        System.out.print(pers1.getAdressePostale().getCodePostal() + " ");
        System.out.println(pers1.getAdressePostale().getVille());

    }
}