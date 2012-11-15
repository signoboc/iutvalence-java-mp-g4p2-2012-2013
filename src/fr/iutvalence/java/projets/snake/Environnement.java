package fr.iutvalence.java.projets.snake;

import java.util.Random;

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
	 * Désigne la position de la pastille
	 */
	private Coordonnees positionPastille;

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
						if ((j != abs) || (i != ord))
							this.grille[i][j] = Case.VIDE; 
						else
							this.grille[i][j] = Case.PASTILLE; //traitement du cas particulier où la case contient la pastille
					}
					j++;
				}
			}
			i++;
		}

	}
	
	/**
	 * Constructeur de l'environnement avec les coordonnées de la nouvelle pastille données.
	 * @param nouvellepastille : Couple de coordonnées de la nouvelle pastille.
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
						if ((j != abs) || (i != ord))
							this.grille[i][j] = Case.VIDE; 
						else
							this.grille[i][j] = Case.PASTILLE; //traitement du cas particulier où la case contient la pastille
					}
					j++;
				}
			}
			i++;
		}

	}
	
	/**
	 * Méthode pour générer une pastille aux coordonnées aléatoires.
	 * @return : Couple de coordonnées de la nouvelle pastille.
	 */
	public Coordonnees genererNouvellePastille()
	{
		int abs = (new Random().nextInt(TAILLEGRILLE - 2)) + 1;
		int ord = (new Random().nextInt(TAILLEGRILLE - 2)) + 1;
		this.positionPastille = new Coordonnees(abs, ord);
		return this.positionPastille;
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
				j++;
			}
			res = res + "\n";
			i++;
		}

		return res;
	}

	// FIXME autres méthodes ?
}
