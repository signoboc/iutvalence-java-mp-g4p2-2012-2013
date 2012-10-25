// FIXME renommer le paquetage (fr.iutvalence.java.projets.snake)(FIXED)
package fr.iutvalence.java.projets.snake;


/**
 * Classe Serpent Désigne le serpent qui représente le personnage principal du jeu.
 * 
 * @author berardk
 */
public class Serpent
{

	/**
	 * Longueur initiale (nombre d'éléments) par défaut du serpent.
	 */
	// FIXME renommer la constante (longueur par défaut) (FIXED)
	public final static int LONGUEUR_INIT = 4;

	// FIXME est-ce que ces 2 attributs suffisent pour placer entièrement le serpent sur un repère ?
	
	/**
	 * Nombre d'éléments qui constituent le serpent
	 */
	private int longueur;
	
	/**
	 * Tableau contenant les positions des éléments du serpent
	 */
	private Coordonnees[] position;

	/**
	 * Initialise le serpent avec une position et une longueur par défaut.
	 */
	public Serpent()
	{
		super();
		this.longueur = LONGUEUR_INIT;
		this.position = new Coordonnees[this.longueur];
		int i=0;
		while (i<this.longueur)
		{
			this.position[i]= new Coordonnees(Environnement.TAILLEGRILLE/2,Environnement.TAILLEGRILLE/2  - i);
			i++;
		}
	}

	/**
	 * Initialise le serpent avec une longueur donnée et une position par défaut.
	 * 
	 * @param longueur
	 *            : longueur initiale du corps du serpent
	 */
	public Serpent(int longueur)
	{
		super();
		this.longueur = longueur;
		this.position = new Coordonnees[this.longueur];
		
	}

	// FIXME méthodes ?
}
