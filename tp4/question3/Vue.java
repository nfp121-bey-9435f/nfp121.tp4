package question3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.util.Observable;
import java.util.Observer;

/**
 * D√©crivez votre classe Controleur ici.
 * 
 * @author  Sami Abou Karam  
 * @version Juin 2020
 */
public class Vue extends JPanel implements Observer{

    private JLabel etatPile;
    private PileModele<Integer> pile;

    public Vue(PileModele<Integer> pile) {
        super();
        this.pile = pile;
        this.etatPile = new JLabel("entrez des nombres entiers");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(etatPile);
        setBackground(Color.green);
        // inscription aupr√®s du mod√®le comme observateur
        pile.addObserver(this);
    }

     /**
     * Mettre ‡ jour la vue suite ‡ une Èmission du modËle.
     */
    public void update(Observable obs, Object arg) {
        etatPile.setText(pile.toString()); // ou obs.toString()
    }

}
