package TP_9_Facile;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] ObjetsGeometriques = {new Cercle(5), new Rectangle(5, 6)};
        for (ObjetGeometrique ObjetGeometrique : ObjetsGeometriques
        ) {
            System.out.println("Voici le perimètre : " + ObjetGeometrique.perimetre() + " \n\tVoici l'air : " + ObjetGeometrique.surface());
        }
    }
}
