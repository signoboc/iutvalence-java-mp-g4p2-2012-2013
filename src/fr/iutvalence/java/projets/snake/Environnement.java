package fr.iutvalence.java.projets.snake;

import java.util.Random;
// FIXME documenter le repere
/**
 * Classe Environnement représentant le terrain de jeu, où évolueront la pastille et
 * le serpent.
 * 
 * @author berardk
 */
public class Environnement
{

	/**
	 * Désigne une valeur de la taille du terrain de jeu.
	 */
	public final static int TAILLEGRILLE = 20;
	

	/**
	 * Désigne le tableau qui sera le terrain de jeu. Une grille contient un serpent et une pastille.
	 */
	private Case[][] grille;

	/**
	 * Constructeur de l'environnement de jeu Initialise le terrain avec une pastille positionnée aléatoirement (grâce à
	 * la fonction Random().nextInt. La taille de la grille est fixée par la constante TAILLEGRILLE.
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
					this.grille[i][j] = Case.MUR; //on met un mur sur la première et la dernière ligne
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
						this.grille[i][j] = Case.MUR; //on met un mur dans la première et la dernière colonne
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
	 * Méthode permettant de lire le contenu d'une case dans la grille
	 * @param positionCase : Coordonnées de la case que l'on souhaite lire.
	 * @return : Contenu de la case.
	 * @throws CoordonneesInvalideException : Exception lorsque les coordonnées renseignées sont hors grille.

	 */
	public Case getCaseAt(Coordonnees positionCase) throws CoordonneesInvalideException
	{
		if (this.estHorsGrille(positionCase)) throw new CoordonneesInvalideException();
		return this.grille[positionCase.getAbscisse()][positionCase.getOrdonnee()];
	}

	/**
	 * Méthode permettant de changer le contenu d'une case.
	 * @param positionCase : Coordonnées de la case que l'on souhaite modifier.
	 * @param contenu : Contenu que l'on souhaite affecter à la case.
	 * @throws CoordonneesInvalideException : Exception lorsque les coordonnées renseignées sont hors grille.
	 */
	public void setCaseAt(Coordonnees positionCase, Case contenu) throws CoordonneesInvalideException
	{
		if (this.estHorsGrille(positionCase)) throw new CoordonneesInvalideException();
		this.grille[positionCase.getAbscisse()][positionCase.getOrdonnee()] = contenu;
	}
	
	/**
	 * Méthode permettant de savoir si la case demandé est dans la grille ou non.
	 * @param positionCase : Coordonnées de la case demandée.
	 * @return : Booléen.
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

	// FIXME autres méthodes ?
}
