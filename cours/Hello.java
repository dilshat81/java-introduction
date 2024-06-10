package cours;
/**
 * On a déclaré une classe nommée Hello dans un fichier Hello.java.
 * 
 ⚠ les mots réservés d'un langage de programmation ne doivent pas 
 être utilisés pour nommer des variables ou des fonctions ou des classes, ... 
 * 
 * Tous les fichiers contenant du code Java auront l'extension .java
 * On crée un fichier par classe, et la classe aura extactement le même
 * nom que le fichier (sans l'extension) en respectant la casse.
 * Par convention, les noms de classe commencent par une MAJUSCULE. 
 */

 
public class Hello {

    public static void main(String[] args) {
        int carre = Fonctions.carre(4);


        // commentaires sur 1 ligne
        /* commentaires 
            sur plusieurs lignes */
        System.out.println("------------------------------------");
        System.out.println("Hello world !");
        
        int a; // déclaration de la varaible nommée a de type entier
        a = 5; // affectation de la valeur 5 à la variable a

        int b = 12;  // je fais la déclaration et l'affectation en même temps
        // ⚠ Vous ne pouvez pas utiliser une variable avant de l'avoir déclarée
        int c = 4;

        float f = 5.2f;

        /* 
         * Pour nommer les variables (ou fonctions, ou classes), il y a des règles :
         * - on ne peut utiliser que des lettres (maj ou min)
         * - des chiffres (sauf pour le 1er caractère)
         * - et les caractères _ et $
         * 
         * Par convention les noms de variables commencent par une minuscule et 
         * on utilise la casse camelCase. 
         * 
         */

         /*
          * TYPES DE DONNÉES
          * Le type d'une variable est important. Vous ne pouvez affecter une valeur
          * à une variable que si elle est du même type que cette variable.
          * ex : une variable de type integer ne peut pas contenir une variable de type double.
          * 
          */

          int entier = 5;
          double reel = 4.2;
        //   entier ！= reel;  // un entier ne peut pas avoir une valeur réelle
        reel = entier;
        // on peut affecter une valeur entière à une variable de type réel 

        byte age = 0;
        entier = age;
        reel = age;
        // age = entier; // un byte ne peut pas contenir un int (risque de perte de données)

        /*
         * Le type String n'est pas un type primitif, c'est une classe (d'où la majuscule).
         * Mais on va pouvoir l'utiliser comme une variable de type primitif, c'est à dire
         * qu'on peut l'utiliser comme une valeur.
         */
        String chaine = "une chaîne de caractères";
        System.out.println("Ma variable chaine contient " + chaine);
        /**
         * L'opérateur de concaténation est le +
         * La concaténation est l'opération qui consiste à coller 2 chaînes de caractères.
         */

        // EXO : afficher "La variable a vaut " suivi de la valeur de la variable a
        /** EXPLICATION : la concaténation va fonctionner pour tous les types primitifs
         *               parce que JAVA va les transformer en String
         */
        String result = "La variable a vaut " + a;
        System.out.println(result);

        /**
         * Si je veux affecter une variable de type réél (float ou double) à une variable de type
         * entier (int), il faut d'abord que je transforme le type (=cast)
         */
        entier = 2;
        reel = 4.23;
        entier = (int)reel;
        System.out.println("La variable reel vaut : " + reel);
        System.out.println("La variable entier vaut : " + entier);

        // 
        String nb = "12";
        // entier = (int)nb;
        a = 5 + 12;
        b = a * 2;

        System.out.println("Le nombre vaut " + nb);
        
        /* LES TABLEAUX */
        int[] tableau;          // déclaration d'un tableau d'entiers
        int tableauEntiers[];   // déclaration d'un tableau d'entiers

        tableau = new int[5];   // affectation d'un tableau de 5 entiers à la variable tableau
        /* Le mot clé new est utilisé pour affecter une variable de type objet.
           Cela veut dire qu'un tableau est un objet. Il a donc des propriétés et des méthodes.
         */
        tableau[0] = 45;
        tableau[1] = 2;
        tableau[2] = (int)2.5;
        tableau[3] = 7;
        tableau[4] = 12;
        // tableau[5] = 6;  // Je ne peux pas accéder ni affecter un indice
                            // d'un tableau qui dépasserait sa taille.
                            // ⚠ les indices commencent à 0
        
        // Je ne peux affecter que des expressions du type déclaré
        // tableauEntiers = new double[2];

        /* EXO : afficher la phrase :
            "La 2ième valeur du tableau multiplié par la 5ième valeur vaut "
            suivi du résultat du calcul
        */
        System.out.println("La 2ième valeur du tableau multiplié par la 5ième valeur vaut "
                                 +  tableau[1] * tableau[4] );

        a = 5 + 4 * 3;
        System.out.println("La 2ième valeur du tableau additionné à la 5ième valeur vaut "
                                 +  (tableau[1] + tableau[4]) );
        
        // une autre façon d'affecter des valeurs à un tableau
        int[] tableau2 = new int[] {4, 7, 32, 78, 53, -8};

        // Structures itératives (boucles)
        // WHILE (TANTQUE)
        System.out.println("While");
        int i = 0;
        while(i < tableau2.length) {
            System.out.println(tableau2[i]);
            i++;    // incrémentation de i //i = i + 1;
            // i+=2;   // i = i + 2;
        }
        System.out.println("While avec 1 seule instruction");
        i = 0;
        while(i < tableau2.length) 
            System.out.println(tableau2[i++]);
        System.out.println("cette instruction ne fait pas partie de la boucle");

        /*  EXO : afficher toutes les valeurs de la variable 'tableau' comme l'exemple suivant
                indice : valeur
        */
        System.out.println("version while");

        i = 0;
        while(i <= tableau.length - 1) {
            System.out.println(i + " : " + tableau[i]);
            i++;
        }

        System.out.println("version do while");

        // DO WHILE (FAIRE... TANTQUE)
        /* Cette boucle s'utilisent si on veut exécuter au moins 1 fois la boucle
           quelque soit la condition d'arrêt
         */
        i = 0;
        do {
            System.out.println(i + " : " + tableau[i]);
            i++;
        } while (i <= tableau.length - 1);

        // FOR (POUR i de .. à .. )
        System.out.println("⚠ version for");
        for(int j = 0 ; j <= tableau.length - 1 ; j++) {
            System.out.println(j + " : " + tableau[j]);
        }
        /*
         ⚠ la variable j n'existe que dans la boucle for (parce que la variable j a été
         ⚠   déclarée dans la boucle for)
         ⚠   En JAVA, les variables n'existent que dans le bloc où elles ont été déclarées.
         ⚠   Un bloc est délimité par des {}
         */

        /* STRUCTURES CONDITIONNELLES */
        // IF ELSE
        age = 127;

        if(age > 0) {
            if( age < 18) {
                System.out.println("Vous êtes mineur");
            } else if( 18 => age < 62) {
                System.out.println("Vous êtes majeur");
            } else {
                System.out.println("Vous êtes à la retraite");
            }
        } else {
            System.out.println("Vous n'êtes pas encore né");
        }
        System.out.println("les instructions qui suivent sont exécutées");

        // SWITCH

        String jour = "jeudi";
        String message;
        switch(jour){
            case "lundi":
                message = "c'est difficile de se lever";
                break;
            case "mardi": case "mercredi": case "jeudi":
                message = "on se motive pour le reste de la semaine";
                break;
            case "vendredi":
                message = "demain, c'est le week-end !!!";
                break;
            default:
                message = "on se repose, c'est le week-end";
        }
        System.out.println(message);

        // version if du switch précédent
        if( jour == "lundi") {
            message = "c'est difficile de se lever";
        } else if (jour == "mardi" || jour == "mercredi" || jour == "jeudi") {
            message = "On se motive pour le reste de la semaine";
        } else if (jour == "vendredi") {
            message = "demain, c'est le week-end !!!";
        } else {
            message = "on se repose, c'est le week-end";
        }
        System.out.println(message);


        /* STRUCTURE ITERATIVE : FOREACH (POUR CHAQUE...) 
            C'est une boucle que l'on peut utiliser si l'on veut
            parcourir toutes les valeurs d'un tableau.
                    for(variable : tableau) { ... }
            À chaque itération (=tour de boucle), la variable aura la 
            valeur suivante du tableau.

        * 
        */
        for(int valeur: tableau) {
            System.out.println(valeur);
        }
    }

}