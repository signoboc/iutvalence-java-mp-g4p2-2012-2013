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
	public final static int LONGUEUR_INIT = 4;
	/**
	 * Longueur maximale du serpent
	 */
	public final static int LONGUEUR_MAX = 60;
	
	/**
	 * Nombre d'�l�ments qui constituent le serpent
	 */
	private int longueur;
	
	// FIXME pr�ciser le commentaire (� discuter)
	/**
	 * Tableau contenant les positions des �l�ments du serpent
	 */
	private Coordonnees[] position;
	
	/**
	 * D�signe la direction de la t�te du serpent
	 */
	private Direction direction;

	/**
	 * Initialise le serpent avec une position et une longueur par d�faut.
	 */
	public Serpent()
	{
		super();
		this.longueur = LONGUEUR_INIT;
		this.position = new Coordonnees[LONGUEUR_MAX];
		this.direction = Direction.DROITE;
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
		this.position = new Coordonnees[LONGUEUR_MAX];
		int i=0;
		while (i<this.longueur)
		{
			this.position[i]= new Coordonnees(Environnement.TAILLEGRILLE/2,Environnement.TAILLEGRILLE/2  - i);
			i++;
		}
	}

	@Override
	public String toString()
	{
		String res = "";
		res = res + "Serpent :\nLongueur = " + this.longueur + "\nDirection = " + this.direction + "\nPosition :\n";
	    int i = 0;
	    while (i<this.longueur)
	    	{
	    		if (i == 0)
	    			res = res + "(t�te) ";
	    		else
	    			res = res + "(corps) ";
	    		res = res + (i+1) + " : " + this.position[i] + "\n";
	    		i++;
	    	}
		return res;
	}

	// FIXME m�thodes ?
	
}
