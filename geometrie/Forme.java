package geometrie;

/**
 * Une classe est dite abstraite quand elle est déclarée avec le mot-clé abstract.
 * - une classe abstraite ne peut être instanciée (on ne peut pas déclarer d'objet 
 *      de cette classe)
 * - une classe abstraite peut définir des méthodes abstraites
 *      Une méthode abstraite est une méthode dont on ne définit que la signature.
 *      C'est-à-dire qu'il n'y a pas de corps (pas de code entre les {})
 * 
 * - Toutes les classes qui héritent d'une classe abstraite DOIVENT implémenter le code
 *    des méthodes abstraites. 
 */
public abstract class Forme {
    protected int origine_x;
    protected int origine_y;

    public abstract String infos();

    
    public void setOrigine_x(int x) {
        this.origine_x = x;
    }

    public int getOrigine_x() {
        return this.origine_x;
    }

    public void setOrigine_y(int y) {
        this.origine_y = y;
    }

    public int getOrigine_y() {
        return this.origine_y;
    }

    
}
