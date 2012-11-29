package fr.iutvalence.java.projets.snake;

import java.util.Random;
// FIXME documenter le repere
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
						this.grille[i][j] = Case.VIDE; 
					}
					j++;
				}
			}
			i++;
		}

	}
	
	
	/**
	 * M�thode permettant de lire le contenu d'une case dans la grille
	 * @param positionCase : Coordonn�es de la case que l'on souhaite lire.
	 * @return : Contenu de la case.
	 * @throws CoordonneesInvalideException : Exception lorsque les coordonn�es renseign�es sont hors grille.

	 */
	public Case getCaseAt(Coordonnees positionCase) throws CoordonneesInvalideException
	{
		if (this.estHorsGrille(positionCase)) throw new CoordonneesInvalideException();
		return this.grille[positionCase.getAbscisse()][positionCase.getOrdonnee()];
	}

	/**
	 * M�thode permettant de changer le contenu d'une case.
	 * @param positionCase : Coordonn�es de la case que l'on souhaite modifier.
	 * @param contenu : Contenu que l'on souhaite affecter � la case.
	 * @throws CoordonneesInvalideException : Exception lorsque les coordonn�es renseign�es sont hors grille.
	 */
	public void setCaseAt(Coordonnees positionCase, Case contenu) throws CoordonneesInvalideException
	{
		if (this.estHorsGrille(positionCase)) throw new CoordonneesInvalideException();
		this.grille[positionCase.getAbscisse()][positionCase.getOrdonnee()] = contenu;
	}
	
	/**
	 * M�thode permettant de savoir si la case demand� est dans la grille ou non.
	 * @param positionCase : Coordonn�es de la case demand�e.
	 * @return : Bool�en.
	 */
	public boolean estHorsGrille(Coordonnees positionCase)
	{
		int x = positionCase.getAbscisse();
		int y = positionCase.getOrdonnee();
		return ((x<0)||(x>=TAILLEGRILLE)||(y<0)||(y>=TAILLEGRILLE));
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
