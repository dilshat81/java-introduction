package geometrie;


public class Rectangle extends Forme {
    /* Les variables déclarées dans une classe sont appelées des propriétés
        (ou des attributs).
        Chaque objet créé sera défini par ces propriétés.

        Syntaxe de la déclaration d'une propriété :
            visibilité type nom;
        
        La visibilité (ou la portée ou scope) permet de définir dans quelle
        partie du projet (ou du code) seront accessibles les propriétés, 
        les méthodes, ou les classes.
            public      : visible partout
            private     : visible uniquement dans la classe
            protected   : visible dans la classe et les classes qui héritent
     */
    protected int longueur = 10;
    protected int largeur;

    /*  Cette méthode qui a LE MÊME NOM QUE LA CLASSE dans laquelle elle se
        trouve, s'appelle un CONSTRUCTEUR. C'est cette méthode qui est appelé
        quand on instancie un objet avec le mot clé 'new'.
        ⚠ Une méthode constructeur ne doit rien renvoyer !!!! Un objet de la classe actuelle sera renvoyé.
     */
    public Rectangle(){
        System.out.println("un objet de la classe Rectangle vient d'être instancié !");
    }

    public Rectangle(int l, int L){
        this.largeur = l;
        this.longueur = L;
    }

    public Rectangle(int l, int L, int x, int y) {
        this.largeur = l;
        this.longueur = L;
        this.origine_x = x;
        this.origine_y = y;
    }

    /* Les méthodes sont des fonctions qui vont être accessibles aux objets
       créés avec cette classe.

       Pour déclarer une fonction, on renseigne : 
            - le type retourné par la fonction
            - le nom de la fonction (même règle de nommage que pour les variables)
            - dans les parenthèses, on renseigne les arguments de cette fonction
            - dans les {}, on place les instructions qui seont exécutées chaque
                fois que la fonction sera appelée
            - si la fonction doit retourné une valeur, ne pas oublier 
                une instruction avec le mot clé 'return'

        THIS
        Le mot clé 'this' représente l'objet de la classe actuelle(Rectange) 
        sur lequel on va appelé la fonction (surface).
        Donc, ici, la fonction 'surface' va retourner la valeur de la 
        longueur de l'objet multiplié par la valeur de la largueur de l'objet.
    */
    public int surface() {
        // int c = Fonctions.carre(5);
        return this.longueur * this.largeur;
    }
    
    public int perimetre() {
        return (this.longueur + this.largeur) * 2;
    }

    /* Lorsque on déclare une propriété privé, on ajoute une méthode pour 
        modifier sa valeur. Ces méthodes sont appelés des SETTERS.
        Elles sont nommées ainsi : 
            - set
            - suivi du nom de la propriété
     
     */
    public void setLongueur(int lg){
        if(lg > 0)
            this.longueur = lg;
    }

    public void setLargeur(int largeur) {
        if(largeur > 0) {
            this.largeur = largeur;
        }
    }

    /* Les méthodes qui vont permettre de récupérer les valeurs des propriétés
        privées s'appellent des GETTERS
        Elles sont nommées : 
        - get
        - nom de la propriété
     */
    public int getLongueur() {
        return this.longueur;
    }
    public int getLargeur() {
        return this.largeur;
    }

    public String infos() {
        String resultat = "Largeur : " + this.largeur + "\n";
        resultat = resultat + "Longueur : " + this.longueur + "\n";
        resultat += "X : " + this.origine_x + "\n";
        resultat += "Y : " + this.origine_y + "\n";
        return resultat;
    }

    public void deplacement(int x, int y) {
        this.origine_x = this.origine_x + x;
        this.origine_y += y;
    }

    /*
     * Définir une méthode toString dans une classe permet de définir ce qui va
     * être affiché lorsqu'un objet sera utilisé comme un string (ex: concaténation) 
     */
    public String toString() {
        return this.infos();
    }


}
