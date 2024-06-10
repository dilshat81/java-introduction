import cours.Fonctions;

public class chifoumi {

    public void version1() {
        final int PIERRE = 1;
        final int FEUILLE = 2;
        final int CISEAUX = 3;
        final String[] SIGNES = { "", "pierre", "feuille", "ciseaux" };

        int joueur = 0, ordi = 0, pointsJoueur, pointsOrdi;
        String signeJoueur = "", signeOrdi = "";

        do {
            pointsJoueur = 0; pointsOrdi = 0;
            do {
                System.out.println("Choix : \n\t1. pierre\n\t2. feuille\n\t3. ciseaux");
                try {
                    joueur = Fonctions.demandeEntier(1, 3);
                    ordi = Fonctions.aleatoire(1, 3);
                    System.out.println("Valeur ordi " + ordi );
                    signeJoueur = SIGNES[joueur];
                    signeOrdi = SIGNES[ordi];

                    if( ordi == joueur ) {

                    } else if( ordi == PIERRE && joueur == CISEAUX ||
                               ordi == FEUILLE && joueur == PIERRE ||
                               ordi == CISEAUX && joueur == FEUILLE ) {
                        pointsOrdi++;
                        signeOrdi = signeOrdi.toUpperCase();
                    } else {
                        pointsJoueur++;
                        signeJoueur = signeJoueur.toUpperCase();
                    }
                    System.out.println("╔═══════════════════════╗");
                    System.out.println("║          COUP         ║");
                    System.out.println("╠════════╦══════════════╣");
                    System.out.println("║ Joueur ║ " + signeJoueur + "\t║");
                    System.out.println("║ Ordi   ║ " + signeOrdi + "\t║");
                    System.out.println("╚════════╩══════════════╝");
                    System.out.println("╔═══════════════════╗");
                    System.out.println("║       SCORE       ║" );
                    System.out.println("╠═════════╦═════════╣");
                    System.out.println("║ Joueur  ║ Ordi    ║" );
                    System.out.println("╠═════════╬═════════╣");
                    System.out.println("║    " + pointsJoueur + "    ║    " + pointsOrdi + "    ║");
                    System.out.println("╚═════════╩═════════╝");
                    System.out.println("*************************************************");

                } catch (Exception e) {
                   
                }
            } while(pointsJoueur < 3 && pointsOrdi < 3 );
            System.out.println("Le vainqueur est : ***** " + (pointsJoueur > pointsOrdi ? "JOUEUR" : "ORDI") + " *****");
            System.out.println("");
            String reponse = Fonctions.demandeChaine("\nRejouer ? O/N");
            if( reponse.equals("n") || reponse.equals("N") ) {
                break;
            }
        } while(true);
    }

    public static void main(String[] args) {
        final int PIERRE = 1;
        final int FEUILLE = 2;
        final int CISEAUX = 4;
        final String[] SIGNES = { "", "pierre", "feuille", "ciseaux" };

        int joueur = 0, ordi = 0, pointsJoueur, pointsOrdi;
        String signeJoueur = "", signeOrdi = "";

        do {
            pointsJoueur = 0; pointsOrdi = 0;
            do {
                System.out.println("Choix : \n\t1. pierre\n\t2. feuille\n\t3. ciseaux");
                try {
                    joueur = Fonctions.demandeEntier(1, 3);
                    ordi = Fonctions.aleatoire(1, 3);
                    System.out.println("Valeur ordi " + ordi );
                    signeJoueur = SIGNES[joueur];
                    signeOrdi = SIGNES[ordi];

                    if( ordi == joueur ) {

                    } else if( ordi == PIERRE && joueur == CISEAUX ||
                               ordi == FEUILLE && joueur == PIERRE ||
                               ordi == CISEAUX && joueur == FEUILLE ) {
                        pointsOrdi++;
                        signeOrdi = signeOrdi.toUpperCase();
                    } else {
                        pointsJoueur++;
                        signeJoueur = signeJoueur.toUpperCase();
                    }
                    System.out.println("╔═══════════════════════╗");
                    System.out.println("║          COUP         ║");
                    System.out.println("╠════════╦══════════════╣");
                    System.out.println("║ Joueur ║ " + signeJoueur + "\t║");
                    System.out.println("║ Ordi   ║ " + signeOrdi + "\t║");
                    System.out.println("╚════════╩══════════════╝");
                    System.out.println("╔═══════════════════╗");
                    System.out.println("║       SCORE       ║" );
                    System.out.println("╠═════════╦═════════╣");
                    System.out.println("║ Joueur  ║ Ordi    ║" );
                    System.out.println("╠═════════╬═════════╣");
                    System.out.println("║    " + pointsJoueur + "    ║    " + pointsOrdi + "    ║");
                    System.out.println("╚═════════╩═════════╝");
                    System.out.println("*************************************************");

                } catch (Exception e) {
                   
                }
            } while(pointsJoueur < 3 && pointsOrdi < 3 );
            System.out.println("Le vainqueur est : ***** " + (pointsJoueur > pointsOrdi ? "JOUEUR" : "ORDI") + " *****");
            String reponse = Fonctions.demandeChaine("\nRejouer ? O/N");
            if( reponse.equals("n") || reponse.equals("N") ) {
                break;
            }
        } while(true);
    }
}
