// FIXME renommer le paquetage (fr.iutvalence.java.projets.snake)
package snake;


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
	 * Position du serpent
	 */
	private Coordonnees position;

	/**
	 * Initialise le serpent avec une position donnée et une longueur par défaut.
	 * 
	 * @param depart
	 *            : coordonnées de départ de la tete du serpent
	 */
	public Serpent(Coordonnees depart)
	{
		super();
		this.longueur = LONGUEUR_INIT;
		this.position = depart;
	}

	/**
	 * Initialise le serpent avec une longueur et une position données.
	 * 
	 * @param longueur
	 *            : longueur initiale du corps du serpent
	 * @param depart
	 *            : coordonnées de départ de la tete du serpent
	 */
	public Serpent(int longueur, Coordonnees depart)
	{
		super();
		this.longueur = longueur;
		this.position = depart;
	}

	// FIXME méthodes ?
}
