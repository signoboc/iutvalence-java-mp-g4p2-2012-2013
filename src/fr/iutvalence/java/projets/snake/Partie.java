package fr.iutvalence.java.projets.snake;

/**
 * Classe : Partie Classe principale de l'application : Gère la gestion des autres classes, génère la partie de jeu.
 * 
 * @author berardk
 */
public class Partie
{
	/**
	 * Désigne le nom du joueur.
	 */
	private String nomJoueur;

	/**
	 * Désigne le score du joueur.
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
	
	
	
	
	// FIXME (autres) attributs, constructeurs, méthodes ?
}
