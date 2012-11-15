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
	public final static int LONGUEUR_INIT = 4;
	/**
	 * Longueur maximale du serpent
	 */
	public final static int LONGUEUR_MAX = 60;
	
	/**
	 * Nombre d'éléments qui constituent le serpent
	 */
	private int longueur;
	
	// FIXME préciser le commentaire (à discuter)
	/**
	 * Tableau contenant les positions des éléments du serpent
	 */
	private Coordonnees[] position;
	
	/**
	 * Désigne la direction de la tête du serpent
	 */
	private Direction direction;

	/**
	 * Initialise le serpent avec une position et une longueur par défaut.
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
	 * Initialise le serpent avec une longueur donnée et une position par défaut.
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
	
	/**
	 * Oriente la tête du serpent vers le haut
	 */
	public void OrienterHaut()
	{
		this.direction = Direction.HAUT;
	}
	
	/**
	 * Oriente la tête du serpent vers le bas
	 */
	public void OrienterBas()
	{
		this.direction = Direction.BAS;
	}
	
	/**
	 * Oriente la tête du serpent vers la gauche
	 */
	public void OrienterGauche()
	{
		this.direction = Direction.GAUCHE;
	}
	
	/**
	 * Oriente la tête du serpent vers la droite
	 */
	public void OrienterDroite()
	{
		this.direction = Direction.DROITE;
	}
	
	/**
	 * Fonction qui gère les déplacements suivant les différentes directions du serpent.
	 */
	public void DeplacerSerpent()
	{
		int i = 0 ;
		int abspos ;
		int ordpos;
		
		// Pour déplacer le serpent vers le haut
		if (this.direction == Direction.HAUT)
		{
			abspos = this.position[i].getAbscisse();
			ordpos = this.position[i].getOrdonnee();
			this.position[i].setAbscisse(abspos -1);
			i++;
			while (i<this.longueur)
			{
				this.position[i].setAbscisse(abspos);
				this.position[i].setOrdonnee(ordpos);
				abspos++;
				ordpos++;
			}
		}
		// Pour déplacer le serpent vers le bas
		if (this.direction == Direction.BAS)
		{
			abspos = this.position[i].getAbscisse();
			ordpos = this.position[i].getOrdonnee();
			this.position[i].setAbscisse(abspos +1);
			i++;
			while (i<this.longueur)
			{
				this.position[i].setAbscisse(abspos);
				this.position[i].setOrdonnee(ordpos);
				abspos++;
				ordpos++;
			}
		}
		
		// Pour déplacer le serpent vers la gauche
		if (this.direction == Direction.GAUCHE)
		{
			abspos = this.position[i].getAbscisse();
			ordpos = this.position[i].getOrdonnee();
			this.position[i].setAbscisse(ordpos -1);
			i++;
			while (i<this.longueur)
			{
				this.position[i].setAbscisse(abspos);
				this.position[i].setOrdonnee(ordpos);
				abspos++;
				ordpos++;
			}
		}
		
		// Pour déplacer le serpent vers la droite
		if (this.direction == Direction.DROITE)
		{
			abspos = this.position[i].getAbscisse();
			ordpos = this.position[i].getOrdonnee();
			this.position[i].setAbscisse(ordpos +1);
			i++;
			while (i<this.longueur)
			{
				this.position[i].setAbscisse(abspos);
				this.position[i].setOrdonnee(ordpos);
				abspos++;
				ordpos++;
			}
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
	    			res = res + "(tête) ";
	    		else
	    			res = res + "(corps) ";
	    		res = res + (i+1) + " : " + this.position[i] + "\n";
	    		i++;
	    	}
		return res;
	}

	// FIXME méthodes ?
	
}
