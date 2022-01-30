package question2;

import java.awt.event.*;
import java.awt.event.*;
import java.awt.TextArea;
import java.util.Observer;

/**
 * Décrivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class JButtonObserver { // à compléter

    private String nom;
    private TextArea contenu;
    
    private Observer jbo1,jbo2,jbo3;
    private String jmo1,jmo2,jmo3;
    
    
    /**
     * Constructeur d'objets de classe JButtonObserver
     * 
     * @param nom
     *            le nom du bouton, jbo1, jbo2, jbo3, jmo1, jmo2, jmo3
     * @param contenu
     *            la zone de texte de l'applette
     */
    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }


    public void actionPerformed123(ActionEvent evt) {
        String message = "observateur " + this.nom + " " + this.contenu.getText(); 
        //contenu.append(message + "\n");
        System.out.print(message + "\n");
    }

}

