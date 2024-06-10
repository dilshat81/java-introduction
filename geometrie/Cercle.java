package geometrie;

public class Cercle extends Forme {
    private double rayon;

    // CONSTRUCTEURS
    public Cercle(){}
    public Cercle(double r) {
        this.rayon = r;
    }

    public String infos() {
        return "Rayon: " + this.rayon + " cm\n" 
               + "X: " + this.origine_x + "\n"
               + "Y: " + this.origine_y;
    }

    // GETTERS - SETTERS
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return this.rayon;
    }
}
