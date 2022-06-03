package entites;

public class TestPersonne {
    public static void main(String[] args) {
        Personne pers1 = new Personne("Jean", "Moulin", new AdressePostale(25, "rue la place", 44250, "Nantes"));
        Personne pers2 = new Personne("Marc", "Dupont", new AdressePostale(5, "rue la cours", 44150, "Ancenis"));
    }
}