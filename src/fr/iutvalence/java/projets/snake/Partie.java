package fr.iutvalence.java.projets.snake;

/**
 * Classe : Partie Classe principale de l'application : G�re la gestion des autres classes, g�n�re la partie de jeu.
 * 
 * @author berardk
 */
public class Partie
{
	/**
	 * D�signe le nom du joueur.
	 */
	private String nomJoueur;

	/**
	 * D�signe le score du joueur.
	 */
	private int scoreJoueur;

	/**
	 * Constructeur de la partie.
	 */
	public Partie()
	{
		super();
		Environnement map = new Environnement();
		Serpent snake = new Serpent();
	}
	
	
	
	
	// FIXME (autres) attributs, constructeurs, m�thodes ?
}
