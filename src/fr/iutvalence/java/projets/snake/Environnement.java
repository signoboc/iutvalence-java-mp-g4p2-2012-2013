package fr.iutvalence.java.projets.snake;

import java.util.Random;

/**
 * Classe Environnement repr�sentant le terrain de jeu, o� �volueront la pastille et
 * le serpent.
 * 
 * @author berardk
 */
public class Environnement
{

	/**
	 * D�signe une valeur de la taille du terrain de jeu.
	 */
	public final static int TAILLEGRILLE = 20;
	
	/**
	 * D�signe la position de la pastille
	 */
	private Coordonnees positionPastille;

	/**
	 * D�signe le tableau qui sera le terrain de jeu. Une grille contient un serpent et une pastille.
	 */
	private Case[][] grille;

	/**
	 * Constructeur de l'environnement de jeu Initialise le terrain avec une pastille positionn�e al�atoirement (gr�ce �
	 * la fonction Random().nextInt. La taille de la grille est fix�e par la constante TAILLEGRILLE.
	 */
	public Environnement()
	{
		super();
		int abs = (new Random().nextInt(TAILLEGRILLE - 2)) + 1;
		int ord = (new Random().nextInt(TAILLEGRILLE - 2)) + 1;
		this.positionPastille = new Coordonnees(abs, ord);
		this.grille = new Case[TAILLEGRILLE][TAILLEGRILLE];
		int i = 0;
		int j;
		while (i < TAILLEGRILLE)
		{
			j = 0;
			if ((i == 0) || (i == TAILLEGRILLE - 1))
			{
				while (j < TAILLEGRILLE) 
				{
					this.grille[i][j] = Case.MUR; //on met un mur sur la premi�re et la derni�re ligne
					j++;
				}
				j = 0;
			}
			else
			{
				while (j < TAILLEGRILLE)
				{
					if ((j == 0) || (j == TAILLEGRILLE - 1))
					{
						this.grille[i][j] = Case.MUR; //on met un mur dans la premi�re et la derni�re colonne
					}
					else
					{
						if ((j != abs) || (i != ord))
							this.grille[i][j] = Case.VIDE; 
						else
							this.grille[i][j] = Case.PASTILLE; //traitement du cas particulier o� la case contient la pastille
					}
					j++;
				}
			}
			i++;
		}

	}
	
	/**
	 * Constructeur de l'environnement avec les coordonn�es de la nouvelle pastille donn�es.
	 * @param nouvellepastille : Couple de coordonn�es de la nouvelle pastille.
	 */
	public Environnement(Coordonnees nouvellepastille)
	{
		super();
		this.positionPastille = nouvellepastille;
		int abs = nouvellepastille.getAbscisse();
		int ord = nouvellepastille.getOrdonnee();
		this.grille = new Case[TAILLEGRILLE][TAILLEGRILLE];
		int i = 0;
		int j;
		while (i < TAILLEGRILLE)
		{
			j = 0;
			if ((i == 0) || (i == TAILLEGRILLE - 1))
			{
				while (j < TAILLEGRILLE) 
				{
					this.grille[i][j] = Case.MUR; //on met un mur sur la premi�re et la derni�re ligne
					j++;
				}
				j = 0;
			}
			else
			{
				while (j < TAILLEGRILLE)
				{
					if ((j == 0) || (j == TAILLEGRILLE - 1))
					{
						this.grille[i][j] = Case.MUR; //on met un mur dans la premi�re et la derni�re colonne
					}
					else
					{
						if ((j != abs) || (i != ord))
							this.grille[i][j] = Case.VIDE; 
						else
							this.grille[i][j] = Case.PASTILLE; //traitement du cas particulier o� la case contient la pastille
					}
					j++;
				}
			}
			i++;
		}

	}
	
	/**
	 * M�thode pour g�n�rer une pastille aux coordonn�es al�atoires.
	 * @return : Couple de coordonn�es de la nouvelle pastille.
	 */
	public Coordonnees genererNouvellePastille()
	{
		int abs = (new Random().nextInt(TAILLEGRILLE - 2)) + 1;
		int ord = (new Random().nextInt(TAILLEGRILLE - 2)) + 1;
		this.positionPastille = new Coordonnees(abs, ord);
		return this.positionPastille;
	}
	
	
	/**
	 * M�thode qui permet de placer le serpent sur le terrain � l'aide de son tableau de positions.
	 * @param snake : serpent � placer sur la map
	 */
	public void placerSerpent(Serpent snake)
	{
		int i = 1;
		int abs;
		int ord;
		int longueur = snake.getLongueur();
		Coordonnees[] position = snake.getPosition();
		this.grille[position[0].getAbscisse()][position[0].getOrdonnee()] = Case.TETE;
		while (i < longueur )
		{
			abs = position[i].getAbscisse();
			ord = position[i].getOrdonnee();
			this.grille[abs][ord] = Case.CORPS;
			i++;
		}
	}
	
	
	
	@Override
	public String toString()
	{
		String res = "";
		int i = 0;
		int j;
		while (i < TAILLEGRILLE)
		{
			j = 0;
			while (j < TAILLEGRILLE)
			{
				if (this.grille[i][j] == Case.VIDE)
				{
					res = res + "--";
				}
				if (this.grille[i][j] == Case.MUR)
				{
					res = res + "##";
				}
				if (this.grille[i][j] == Case.PASTILLE)
				{
					res = res + "PP";
				}
				if (this.grille[i][j] == Case.TETE)
				{
					res = res + "TT";
				}
				if (this.grille[i][j] == Case.CORPS)
				{
					res = res + "cc";
				}
				j++;
			}
			res = res + "\n";
			i++;
		}

		return res;
	}

	// FIXME autres m�thodes ?
}
