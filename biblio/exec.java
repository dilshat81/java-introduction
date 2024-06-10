package biblio;

import java.io.*;
import cours.Fonctions;

public class exec {
    // public static void exemple(String[] args) {
    //     if (args.length == 5) {
    //         String titre = args[0];
    //         int nb = Integer.parseInt(args[1]);
    //         String prenom = args[2];
    //         String nom = args[3];
    //         int annee = Integer.parseInt(args[4]);

    //         Livre book = new Livre();
    //         book.setTitre(titre);
    //         book.setNbPages(nb);

    //         Auteur writer = new Auteur();
    //         writer.setPrenom(prenom);
    //         writer.setNom(nom);
    //         writer.setAnne(annee);

    //         book.setAuteur(writer);

    //         System.out.println(book.fiche());
    //     }

    // }

    public static void buffer() {
        try {
            BufferedReader flux = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Titre ? ");
            String titre = flux.readLine();
            System.out.println("Nb de pages ?");
            int nb = Integer.parseInt(flux.readLine());
            System.out.println("Prénom de l'auteur ?");
            String prenom = flux.readLine();
            System.out.println("Nom de l'auteur ?");
            String nom = flux.readLine();
            System.out.println("Année de naissance de l'auteur ?");
            int annee = Integer.parseInt(flux.readLine());
            flux.close();
            Livre l = new Livre();
            l.setTitre(titre);
            l.setNbPages(nb);
            l.setAuteur(new Auteur(prenom, nom, annee));

            System.out.println("Voici le livre que vous avez entré : ");
            System.out.println(l.fiche());
        } catch (IOException ioe) {
            System.err.println(ioe);
        } catch (NumberFormatException nfe) {
            System.err.println("Vous n'avez pas entré un format numérique valide");
        } finally {
            System.out.println("Fin du traitement des erreurs");
            System.out.println("Le bloc finally est toujours exécuté, qu'il y ait eu une erreur capturée ou pas");
        }
        System.out.println("FIN DU PROGRAMME");
    }

    public static void entrerEntierValide() {
        int nb = 0;
        boolean invalide = true;
        do {
            System.out.println("Tapez un nombre entier : ");
            try {
                nb = Fonctions.demandeEntier();
                invalide = false;
            } catch (Exception e) {
                System.out.println("Ce n'est pas un nombre entier valide, recommencez");
            }
        } while (invalide);

        System.out.println("Vous avez tapé le nombre " + nb);
        
    }

    public static void devinezNombreEntier() {
        /* EXERCICE : Demander à l'utilisateur de taper un nombre entier.
         *      Tant qu'il n'a pas taper un nombre entier valide, 
         *      continuer à lui demander de taper un entier.
            FAIRE
                demander un nombre
            TANT QUE nombre n'est pas un nombre
         */
        int nb = 0;
        boolean invalide = true;
        int alea = (int)(Math.random() * 10 + 1);
        System.out.println("alea=" + alea);
        int cpt = 0;
        do {
            System.out.println("Devinez un nombre entre 1 et 10 (" + ++cpt + "ème essai) :" ) ;
            try {
                nb = Fonctions.demandeEntier();
                if(nb < 1 || nb > 10) {
                    System.out.println("Le nombre est compris entre 1 et 10 !!!!!");
                    cpt--;
                }
                invalide = false;
            } catch (Exception e) {
                System.out.println("Ce n'est pas un nombre entier valide, recommencez");
                cpt--;
            }
        } while (invalide || (cpt < 3 && nb != alea));

        if(nb == alea && cpt <= 3) {
            System.out.println("Bravo, vous avez deviné le nombre "
                                    + nb + " au " + cpt + "ie essai"  ); 
        } else {
            System.out.println("Perdu, il fallait deviner " + alea);
        }
    }

    public static void main(String[] args) {
        int nb = 0;
        boolean invalide = true;
        int alea = (int)(Math.random() * 10 + 1);
        System.out.println("alea=" + alea);
        int cpt = 0;
        do {
            System.out.println("Devinez un nombre entre 1 et 10 (" + ++cpt + "ème essai) :" ) ;
            try {
                nb = Fonctions.demandeEntier(1, 10);
                invalide = false;
            } catch (NumberFormatException e) {
                System.out.println("Ce n'est pas un nombre entier valide, recommencez");
                cpt--;
            } catch(IndexOutOfBoundsException ie) {
                System.out.println(ie.getMessage());
                cpt--;
            }
        } while (invalide || (cpt < 3 && nb != alea));

        if(nb == alea/* && cpt <= 3 */) {
            System.out.println("Bravo, vous avez deviné le nombre "
                                    + nb + " au " + cpt + "ie essai"  ); 
        } else {
            System.out.println("Perdu, il fallait deviner " + alea);
        }
    }
}
