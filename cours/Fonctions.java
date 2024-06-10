package cours;

import geometrie.Forme;
import java.io.*;

public abstract class Fonctions {
    /* Le mot clé static signifie que cette fonction n'est pas lié à un
        objet de la classe Fonction. Je peux appeler cette fonction sans
        être obligé de déclarer un objet.
     */

    /* Utiliser le mot-clé 'final' pour la définition d'une propriété
     * signifie que cette propriété ne peut pas être modifié.
     * On appelle ça une CONSTANTE.
     * Convention de nommage : le nom d'une constante est tout en 
     * MAJUSCULE (les mots séparés par des _ , snake_case)
     */
    final public static  double PI = 3.1415926;

    public static int carre(int nombre) {
        return nombre * nombre;
    }

    static int n = 4;

    final static double tva(double prix){
        return prix * .2;
    }

    public static void premiers() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " x 2 = " + i*2);
        }
        
    }

    protected static void dessiner(Forme f) {
        System.out.println("Je dessine la forme : ");
        System.out.println(f.infos());
    }

    public static int demandeEntier() {
        BufferedReader flux = new BufferedReader(new InputStreamReader(System.in));
        int resultat = 0;
        try {
            resultat = Integer.parseInt(flux.readLine());
        } catch (IOException ioe) {
        } 
        return resultat;
    }

    /* Dans cette version de la méthode demandeEntier, on précise qu'elle
     * peut déclencher une erreur du type IndexOutOfBoundsException
     */
    public static int demandeEntier(int min, int max) 
                    throws IndexOutOfBoundsException {

        BufferedReader flux = new BufferedReader(new InputStreamReader(System.in));
        int resultat = 0;
        try {
            resultat = Integer.parseInt(flux.readLine());
            if(resultat < min || resultat > max) {
                // throw permet de déclencher une erreur 
                throw new IndexOutOfBoundsException("Le nombre doit "+
                    "être compris entre " + min + " et " + max);
            }
        } catch (IOException ioe) {
        } 
        return resultat;
    }

    public static String demandeChaine(String question) {
        BufferedReader flux = new BufferedReader(new InputStreamReader(System.in));
        String chaine = "";
        try {
            System.out.println(question);
            chaine = flux.readLine();
            // flux.close();
        } catch (Exception e) {
        }
        return chaine;
    }

    public static void salut(String prenom) {
        System.out.println("Bonjour " + prenom + ", bienvenue au cours de JAVA");
    }
    public static double toto(double a, double b, double c) {
        if (c == 0) {
            System.out.println("Tentative de division par 0 !!!!");
            return Double.NaN;
        }
        return 5 * a + 3 * b / c;
    }

    public static double toto2(double a, double b, double c)
            throws ArithmeticException {
        if( c == 0 ){
            throw new ArithmeticException("T'as pas le droit de diviser par 0");
        }
        return 5 * a + 3 * b / c;

    }
    
    public static String saison(String mois) {
        String saison = "";
        switch (mois) {
            case "janvier": case "fevrier": case "decembre":
                saison = "hiver";
                break;
        
            case "mars", "avril", "mai":
                saison = "printemps";
                break;

            case "juin", "juillet", "aout":
                saison = "été";
                break;
        
            case "septembre", "octobre", "novembre":
                saison = "automne";
                break;

            default: 
                saison = "ce n'est pas un mois du calendrier";
        }
        return saison;
    }

    public static String saison(int mois) {
        String saison = "";
        switch (mois) {
            case 1: case 2: case 12:
                saison = "hiver";
                break;
        
            case 3, 4, 5:
                saison = "printemps";
                break;

            case 6, 7, 8:
                saison = "été";
                break;
        
            case 9, 10, 11:
                saison = "automne";
                break;

            default: 
                saison = "ce n'est pas un mois du calendrier";
        }
        return saison;
    }

    public static void groupe() {
        String[] groupe = { "badiss", "ahmed","sandric","laïna","laila","dilshat","amal","jaspreet"};
        // FOR
        for (int i = 0; i < groupe.length; i++) {
            salut(groupe[i]);
        }
        // WHILE
        int i = 0;
        while(i < groupe.length) {
            salut(groupe[i++]);
        }

        // DO... WHILE
        i = 0;
        do {
            salut(groupe[i++]);
        } while(i < groupe.length); 

        // FOR EACH
        for(String stagiaire: groupe) {
            salut(stagiaire);
        }
    }

    public static int aleatoire(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
