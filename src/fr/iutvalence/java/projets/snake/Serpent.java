// FIXME renommer le paquetage (fr.iutvalence.java.projets.snake)(FIXED)
package fr.iutvalence.java.projets.snake;


/**
 * Classe Serpent D�signe le serpent qui repr�sente le personnage principal du jeu.
 * 
 * @author berardk
 */
public class Serpent
{

	/**
	 * Longueur initiale (nombre d'�l�ments) par d�faut du serpent.
	 */
	// FIXME renommer la constante (longueur par d�faut) (FIXED)
	public final static int LONGUEUR_INIT = 4;

	// FIXME est-ce que ces 2 attributs suffisent pour placer enti�rement le serpent sur un rep�re ?
	
	/**
	 * Nombre d'�l�ments qui constituent le serpent
	 */
	private int longueur;
	
	/**
	 * Tableau contenant les positions des �l�ments du serpent
	 */
	private Coordonnees[] position;

	/**
	 * Initialise le serpent avec une position et une longueur par d�faut.
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
	 * Initialise le serpent avec une longueur donn�e et une position par d�faut.
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

	// FIXME m�thodes ?
}
