import cours.Fonctions;

public class resto {
    /* La variable 'options' est un tableau de tableau de String.
     * Cela veut dire que chaque valeur du tableau 'options' est un
     * tableau de String.
     * On appelle ça un tableau à 2 dimensions. 
     * Pour accéder à la valeur '4' par exemple : 
     *      options[2][1]
     * Pour '12', options[2][2]
     */
    static String[][] options = { 
        {"boisson", "1", "2" }, 
        {"entrée" , "2", "5" }, 
        {"plat"   , "4", "12" }, 
        {"dessert", "8", "7" } 
    };
    
    public static int prixDuRepas(int choix) {
        int total = 0;
        for (int i = options.length - 1; i >= 0; i--) {
            int valeurOption = Integer.parseInt(options[i][1]);
            int prixOption = Integer.parseInt(options[i][2]);
            if(choix - valeurOption >= 0 ){
                total += prixOption;
                choix -= valeurOption;
            }
        }
        return total;
    }


    public static void main(String[] args) {
        int choixClient = 0;
        for (String[] option : options) {
            String reponse = Fonctions.demandeChaine(
                "Voulez-vous prendre un(e) " + option[0] + " ? (o/n)");
            if(reponse.toLowerCase().equals("o")) {
                int valeurOption = Integer.parseInt(option[1]);
                // choixClient = choixClient + valeurOption;
                choixClient += valeurOption;
            }
        }

        System.out.println("Le prix du repas est de " + prixDuRepas(choixClient) + " euros");
    }
}
