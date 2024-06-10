package geometrie;

public class Cube extends Carre implements TriDim {
    public double volume() {
        return Math.pow(this.longueur, 3);
    }
}
