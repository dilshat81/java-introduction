import java.text.Normalizer.Form;

import geometrie.*;
public class geo {
    public static void animation3D(TriDim t) {
        System.out.println("je m'anime et je fais " + t.volume()
        + " cm3");
    }
    
    public static void main(String[] args) {
        Sphere s = new Sphere();
        Cercle c = new Cercle(15);
        s.setRayon(15);
        // animation3D(c);
    }
}
