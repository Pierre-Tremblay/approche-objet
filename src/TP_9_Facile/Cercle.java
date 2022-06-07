package TP_9_Facile;

public class Cercle implements ObjetGeometrique {
    double rayon;

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return Math.PI*(rayon*rayon);
    }

    @Override
    public double surface() {
        return Math.PI*2*rayon;
    }
}
