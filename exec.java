// import cours.Fonctions;
import geometrie.*;


public class exec {
    public static void main(String[] args) {
        /* EXERCICE : écrire le code qui permet d'afficher toutes
          les valeurs du tableau nommé 'args' (une valeur par ligne)
                Argument numero xxx : ... 
            
                xxx indice
                ... valeur
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument n° " + i + " : " + args[i]);
        }
         */

        /*  Si on veut afficher les valeurs en commençant par la dernière
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("Argument n° " + i + " : " + args[i]);
        }
        */ 

        // if( args.length == 0 ){
        //     System.out.println("Aucun argument n'a été trouvé");
        // }
        // int i = 0;
        // for (String valeur : args) {
        //     System.out.println("Argument n° " + i++ + " : " + valeur);
        // }

        /* EXERCICE  
         * Si le premier argument de la ligne de commande est 
         *              '-v' ou '--version'
         * alors
         *      afficher "La version de exec est 1.0"
         * 
        */
        // if(args.length > 0) {
        //     if( args[0].equals("-v")  || args[0].equals("--version")) {
        //         System.out.println("La version de exec est 1.0");
        //     }
        // }

        /* EXERCICE : récupérer les arguments de la ligne de commande.
         * 1. Selon la valeur du 1er argument, vous devez instancier un objet :
         *  Si c'est 'carre', vous instancier un carre
         *      le 2ième argument sera la taille d'un côté du carré
         *      le 3iè et le 4iè seront origine_x et origine_y
         * 
         *  Si c'est 'rectangle', vous instanciez un rectangle
         *      le 2ième argument sera la longueur
         *      le 3ième argument sera la largeur
         *      le 4iè et le 5iè seront origine_x et origine_y
         * 
         * 2. Afficher les informations de l'objet créé
         */

        if( args.length > 0 ) {
            String resultat;
            String type = args[0];
            switch (type) {
                case "carre":
                    if( args.length >= 4 ) {
                        int cote = Integer.parseInt(args[1]);
                        int x = Integer.parseInt(args[2]);
                        int y = Integer.parseInt(args[3]);
                        Carre carre = new Carre(cote, x, y);
                        carre.setLargeur(57);
                        resultat = carre.infos();
                        // Fonctions.dessiner(carre);
                    } else {
                        resultat = "Il manque des arguments pour déclarer un carré";
                    }
                    break;
            
                case "rectangle":
                    if( args.length >= 5 ) {
                        int longueur = Integer.parseInt(args[1]);
                        int largeur = Integer.parseInt(args[2]);
                        int x = Integer.parseInt(args[3]);
                        int y = Integer.parseInt(args[4]);
                        Rectangle rectangle = new Rectangle(longueur, largeur, x, y);
                        resultat = rectangle.infos();
                    } else {
                        resultat = "Il manque des arguments pour déclarer un rectangle";
                    }
                    break;
                
                case "cercle":
                    if( args.length >= 2 ) {
                        double rayon = Double.parseDouble(args[1]);
                        Cercle cercle = new Cercle(rayon);
                        resultat = cercle.infos();
                    } else {
                        resultat = "Il manque le rayon du cercle";
                    }
                    break;

                default:
                   resultat = "Veuillez choisir entre un carré et un rectangle, svp";
            }
            System.out.println(resultat);
        }
    }
}
