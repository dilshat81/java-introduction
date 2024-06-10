public class Reponses {
    public static void exo1() {
        String[] tab = new String[] { "bonjour", "je", "m'appelle", "Gérard", "Mentor" };
        String resultat = "";
        for (int i = 0; i < tab.length; i++) {
            // resultat = resultat + tab[i] + " ";
            resultat += tab[i] + " ";
        }
        System.out.println(resultat);
        // return true;
    }

    static double pourcentage(int nombre, int pourcent) {
        return (double) nombre * pourcent / 100;
    }

    static void boucle() {
        int n = 450;
        for (int i = 1; i < 100; i++) {
            // if(i >= 50 && i <= 70) {
            // if(i % 2 == 0) { //si i est un nombre pair
            // System.out.println(i + "% de 450 = " + pourcentage(n, i));
            // }
            // } else if( i % 2 == 1 ) {
            // System.out.println(i + "% de 450 = " + pourcentage(n, i));
            // }
            if (i % 2 != 0) { // si i est un nombre pair
                System.out.println(i + "% de 450 = " + pourcentage(n, i));
            }
        }
    }

    static double solde(int prix, int remise) {
        return prix - pourcentage(prix, remise);
    }

    static int plusPetit(int[] array) {
        int min = array[0];
        for (int valeur : array) {
            if (valeur < min) {
                min = valeur;
            }
        }
        return min;
    }

    static int chercheTableau(int[] entiers, int valeurRecherchee) {
        for (int i = 0; i < entiers.length; i++) {
            if (valeurRecherchee == entiers[i]) {
                return i;
            }
        }
        return -1;
    }

    static int chercheTableau(String[] chaines, String valeurRecherchee) {
        int valeurTrouvee = -1;
        for (int i = 0; i < chaines.length; i++) {
            if (valeurRecherchee == chaines[i]) {
                valeurTrouvee = i;
                break; // break permet de sortir d'une boucle avant la fin
                // continue;
            }
        }
        return valeurTrouvee;
    }

    static void jourDeSemaine() {
        String[] semaine = new String[] { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" };
        for (String jour : semaine) {
            if (jour == "mercredi") {
                continue;
            }
            System.out.println(jour);
        }
    }
}
