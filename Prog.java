/*
 Toutes les classes du package geometrie sont importées avec geometrie.*
 Dans ce fichier, pour pouvoir utiliser une classe qui est 
 dans un autre package, il faut importer la classe.
 */
// import geometrie.*;
import cours.Fonctions;

public class Prog {
    public static void main(String[] args) {
        System.out.println(Fonctions.PI);
        

        Fonctions.salut("James");
        String p = new String("Ted");
        Fonctions.salut(p);
        Fonctions.salut("Ou" + "mar");
        Fonctions.salut("" + 456.4);
        Fonctions.salut(new String("Edward Elric"));
        // Fonctions.salut(Fonctions.demandeChaine());
        Fonctions.toto(4, 5, 0);
        try {
            System.out.println(Fonctions.toto2(4, 5 , 0));            
        } catch (Exception e) {
            System.out.println("Le message d'erreur est : " + e.getMessage());
        }

        System.out.println("--------------------------------------");
        Fonctions.groupe();
        System.out.println("FIN DE LA FONCTION MAIN");
    }
}
