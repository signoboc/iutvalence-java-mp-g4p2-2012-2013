// FIXME renommer le paquetage (fr.iutvalence.java.projets.snake)
package snake;


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
	 * Position du serpent
	 */
	private Coordonnees position;

	/**
	 * Initialise le serpent avec une position donn�e et une longueur par d�faut.
	 * 
	 * @param depart
	 *            : coordonn�es de d�part de la tete du serpent
	 */
	public Serpent(Coordonnees depart)
	{
		super();
		this.longueur = LONGUEUR_INIT;
		this.position = depart;
	}

	/**
	 * Initialise le serpent avec une longueur et une position donn�es.
	 * 
	 * @param longueur
	 *            : longueur initiale du corps du serpent
	 * @param depart
	 *            : coordonn�es de d�part de la tete du serpent
	 */
	public Serpent(int longueur, Coordonnees depart)
	{
		super();
		this.longueur = longueur;
		this.position = depart;
	}

	// FIXME m�thodes ?
}
