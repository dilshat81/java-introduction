package geometrie;

import cours.Fonctions;

public class Sphere extends Cercle implements TriDim {
    public double volume() {
        return 4/3 * Fonctions.PI * Math.pow(this.getRayon(), 3);
    }
}
