package question3;

import question3.tp3.PileI;
import question3.tp3.PileVideException;
import question3.tp3.PilePleineException;

/**
 * Représente le modèle dans une implémentation MVC d'une calculette à pile.
 * 
 * @author  Sami Abou Karam
 * @version Juin 2020
 */

public class PileModele<T> extends  java.util.Observable implements PileI<T> {

    private PileI<T> pile;

    /* Ã  complÃ©ter */
    /**
     * Crée une nouvelle instance de {@see question3.PileModele}.
     * 
     * @param pile Instance de pile utilisée pour empiler les opérandes.
     */

    public PileModele(PileI<T> pile) {
        this.pile = pile;
    }

    /**
     * Empile un opérande dans la calculette.
     * 
     * @param o Opérande à empiler.
     */

    public void empiler(T o) throws PilePleineException {
        pile.empiler(o);
        setChanged();
        notifyObservers(o);
    }

    /**
     * Dépile un opérande de la calculette.
     * 
     * @return Opérande dépilé.
     */

    public T depiler() throws PileVideException {
        T item = pile.depiler();
        setChanged();
        notifyObservers(item);
        return item;
    }

    /**
     * Retourne le dernier opérande empilé dans la calculette.
     */

    public T sommet() throws PileVideException {
        return pile.sommet();
    }

    /**
     * Retourne le taille de la pile interne de la calculette.
     */
    public int taille() {
        return pile.taille();
    }

    /**
     * Retourne la capacité de la pile interne de la calculette.
     */
    public int capacite() {
        return pile.capacite();
    }

    
    /**
     * Définit si la pile interne est vide.
     */
    public boolean estVide() {
        return pile.estVide();
    }

    
    /**
     * Définit si la pile interne est pleine.
     */
    public boolean estPleine() {
        return pile.estPleine();
    }

    public String toString() {
        return pile.toString();
    }
}

/**
 * notez qu'un message d'alerte subsiste Ã  la compilation (unsafe ...) dÃ» Ã 
 * l'emploi de notifyObservers, incontournable et sans consÃ©quence ici
 */
