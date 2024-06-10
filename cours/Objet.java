package cours;

import geometrie.*;

public class Objet {
    public static void main(String[] args) {
        double n = Fonctions.tva(125);
        n = n * Fonctions.PI;
        n = n * Fonctions2.PI;
        // Fonctions.PI = 2;

        String st = new String("c'est du texte");
        String st2 = "c'est du texte";
        
        if(st.equals(st2)) {
            System.out.println("Les 2 string sont égaux");
        } else {
            System.out.println("Les 2 string sont différents");
        }
        System.out.println("\n");

        System.out.println("Le string '" + st + "' a une taille de " + st.length() + "caractères");

        Rectangle r1 = new Rectangle(4, 5, 10, 12);
        Rectangle r2 = new Rectangle(4, 5, 10, 12);
        if(r1.getLargeur() == r2.getLargeur()) {
            System.out.println("Les 2 valeurs sont égales");
        } else {
            System.out.println("Les 2 valeurs sont différentes");
        }

        if( r1.equals(r2) ) {
            System.out.println(">>>>Les 2 objets sont égaux");
        } else {
            System.out.println(">>>>Les 2 objets sont différents");
        }

        System.out.println("r1: " + r1 + "\nr2: " + r2 );

        Rectangle r3 = r1;

        if( r1 == r3 ) {
            System.out.println("Les 2 objets sont égaux");
        } else {
            System.out.println("Les 2 objets sont différents");
        }

        System.out.println("r1: " + r1 + "\nr2: " + r2  + "\nr3: " + r3 );
        r1.setLargeur(99);
        System.out.println("La largueur de r3 = " + r3.getLargeur());

        System.out.println(r1);
        Carre c = new Carre(12);
        System.out.println("Carré " + c.infos());
    }
}
