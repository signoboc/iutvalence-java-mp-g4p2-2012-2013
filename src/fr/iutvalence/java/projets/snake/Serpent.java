package fr.iutvalence.java.projets.snake;

import java.util.Random;



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
			this.position[i]= new Coordonnees(Environnement.TAILLEGRILLE/2,Environnement.TAILLEGRILLE/2 -i);
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
		this.direction = Direction.DROITE;
		int i=0;
		while (i<this.longueur)
		{
			this.position[i]= new Coordonnees(Environnement.TAILLEGRILLE/2,Environnement.TAILLEGRILLE/2  - i);
			i++;
		}
	}
	
	/**
	 * Méthode d'accès à la longueur du serpent.
	 * @return longueur du serpent
	 */
	public int getLongueur()
	{
		return this.longueur;
	}
	
	
	
	/**
	 * Méthode permettant de modifier la valeur de la longueur du serpent.
	 * @param longueur : longueur du serpent
	 */
	public void setLongueur(int longueur)
	{
		this.longueur = longueur;
	}

	/**
	 * Méthode d'accès au tableau de positions du serpent.
	 * @return : Tableau de positions
	 */
	public Coordonnees[] getPosition()
	{
		return this.position;
	}


	/**
	 * Méthode d'accés à la direction du serpent.
	 * @return : La direction du serpent.
	 */
	public Direction getDirection()
	{
		return this.direction;
	}

	/**
	 * Permet d'insérer un élément dans le tableau de position du serpent.
	 * @param positionQueue : Position du dernier élément du serpent.
	 * @param i : Indice dans lequel l'élément se situe.
	 */
	public void setPosition(Coordonnees[] positionQueue)
	{
		this.position = positionQueue;
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
		int absprecedent;
		int ordprecedent;
		
		// Pour déplacer le serpent vers le haut
		if (this.direction == Direction.HAUT)
		{
			abspos = this.position[i].getAbscisse();
			ordpos = this.position[i].getOrdonnee();
			this.position[i].setAbscisse(abspos -1);
			i++;
			while (i<this.longueur)
			{
				absprecedent = this.position[i].getAbscisse();
				ordprecedent = this.position[i].getOrdonnee();
				this.position[i].setAbscisse(abspos);
				this.position[i].setOrdonnee(ordpos);
				i++;
				abspos = absprecedent;
				ordpos = ordprecedent;
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
				absprecedent = this.position[i].getAbscisse();
				ordprecedent = this.position[i].getOrdonnee();
				this.position[i].setAbscisse(abspos);
				this.position[i].setOrdonnee(ordpos);
				i++;
				abspos = absprecedent;
				ordpos = ordprecedent;
			}
		}
		
		// Pour déplacer le serpent vers la gauche
		if (this.direction == Direction.GAUCHE)
		{
			abspos = this.position[i].getAbscisse();
			ordpos = this.position[i].getOrdonnee();
			this.position[i].setOrdonnee(ordpos -1);
			i++;
			while (i<this.longueur)
			{
				absprecedent = this.position[i].getAbscisse();
				ordprecedent = this.position[i].getOrdonnee();
				this.position[i].setAbscisse(abspos);
				this.position[i].setOrdonnee(ordpos);
				i++;
				abspos = absprecedent;
				ordpos = ordprecedent;
			}
		}
		
		// Pour déplacer le serpent vers la droite
		if (this.direction == Direction.DROITE)
		{
			abspos = this.position[i].getAbscisse();
			ordpos = this.position[i].getOrdonnee();
			this.position[i].setOrdonnee(ordpos +1);
			i++;
			while (i<this.longueur)
			{
				absprecedent = this.position[i].getAbscisse();
				ordprecedent = this.position[i].getOrdonnee();
				this.position[i].setAbscisse(abspos);
				this.position[i].setOrdonnee(ordpos);
				i++;
				abspos = absprecedent;
				ordpos = ordprecedent;
			}
		}
	}
	
	/**
	 * Méthode permettant de gérer un déplacement aléatoire du serpent
	 * Plus l'intervalle du nombre aléatoire est grand, plus petite sera la fréquence
	 * de changement d'orientation du serpent.
	 */
	public void orientationAlea ()
	{
		int orientation = new Random().nextInt(4);
		if ((this.direction == Direction.HAUT) || (this.direction == Direction.BAS))
		{
			if (orientation == 2)
				this.direction = Direction.GAUCHE;
			if (orientation == 3)
				this.direction = Direction.DROITE;
		}
		if ((this.direction == Direction.GAUCHE) || (this.direction == Direction.DROITE))
		{
			if (orientation == 0)
				this.direction = Direction.HAUT;
			if (orientation == 1)
				this.direction = Direction.BAS;
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