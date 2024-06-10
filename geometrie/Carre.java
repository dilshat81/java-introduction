package geometrie;

/*
 * Le mot-clé extends indique que le classe Carre
 * hérite de la classe Rectangle : 
 * c'est-à-dire que TOUTES les propriétés et méthodes
 * de la classe Rectangle existent pour la classe Carre (sauf les constructeurs,
 * à part le constructeur par défaut, sans argument)
 * 
 * Dans la classe qui hérite, on n'a pas accès directement aux propriétés
 * privées de la classe mère. 
 */
public class Carre extends Rectangle {
    public Carre() {}
    public Carre(int cote) {
        /* version 1 : utiliser les setters
        this.setLongueur(cote);
        this.setLargeur(cote); */

        /* version 2 : appeler le constructeur de la classe mère.
         * Le mot-clé 'super' fait référence à la classe supérieure, la classe
         * mère dont hérite la classe actuelle. 
         * Je peux donc utiliser un constructeur de la classe Rectangle
         * dans le constructeur de la classe Carre. 
         * ici, j'utilise le constructeur qui prend 2 arguments et qui 
         * donne une valeur à la largeur et à la longueur. 
          ⚠ le constructeur super() ne peut s'utiliser que dans un constructeur
            */
        
        super(cote, cote);

        /* version 3 : changer la visibilité des propriétés de Rectangle
         * Les propriétés privées n'étant accessibles que dans la classe
         * où elles ont été déclarées, je passe la visibilité des propriétés
         * en protégées (protected). 
         * Les propriétés protégées sont accessibles dans la classe où elles
         * sont déclarées et dans les classes qui héritent.
        this.largeur = cote;
        this.longueur = cote;
         */

    }

    public Carre(int cote, int x, int y){
        super(cote, cote, x, y);
    }

    public String infos() {
        String retour = "";
        retour = super.infos();
        retour += "Périmètre : " + this.perimetre() + "\n";
        retour += "Surface : " + this.surface() + "\n";
        return retour;
    }

    public void setLargeur(int l) {
        this.largeur = l;
        this.longueur = l;
    }

    public void setLongueur(int L) {
        this.largeur = L;
        this.longueur = L;
    }

    public void setCote(int c) {
        this.setLargeur(c);
    }
}
