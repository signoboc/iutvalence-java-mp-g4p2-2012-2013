package fr.iutvalence.java.projets.snake;

import javax.swing.JFrame;
import java.awt.Color; 
import javax.swing.JPanel;

/**
 * Classe qui g�re l'interface graphique
 * @author REEKER
 */
public class Fenetre extends JFrame
{

	/**
	 * Constructeur de la classe Fenetre
	 */
	public Fenetre()
	{
		this.setTitle("Snake");									// Titre de la fen�tre.
		this.setSize(400, 500);									// Taille de la fen�tre.
		this.setLocationRelativeTo(null);						// Centrage de la fen�tre.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Faire en sorte que la croix rouge ferme le processus.             
		this.setVisible(true);									// Rendre la fenetre visible.
		this.setResizable(true);								// Empecher le redimensionnement de la fen�tre.
	 
	    this.setContentPane(new Panneau());
	    this.setVisible(true);
  }
}
