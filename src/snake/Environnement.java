// FIXME renommer le paquetage (fr.iutvalence.java.projets.snake)
package snake;

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

	
	// FIXME d�finir les constantes suivantes via une �num�ration (� discuter)
	/**
	 * Constante : Symbolise une case vide sur le terrain.
	 */
	public final static int CASE_VIDE = 0;
	/**
	 * Constante : Symbolise un mur sur le terrain.
	 */
	public final static int MUR = 8;
	/**
	 * Constante : Symbolise la pastille sur le terrain.
	 */
	public final static int PASTILLE = 2;
	/**
	 * Constante : Symbolise la t�te du serpent sur le terrain.
	 */
	public final static int TETE = 5;
	/**
	 * Constante : Symbolise le corps du serpent sur le terrain.
	 */
	public final static int CORPS = 6;

	/**
	 * D�signe la position de la pastille
	 */
	private Coordonnees positionPastille;

	/**
	 * D�signe le tableau qui sera le terrain de jeu. Une grille contient un serpent et une pastille.
	 */
	private int[][] grille;

	/**
	 * Constructeur de l'environnement de jeu Initialise le terrain avec une pastille positionn�e al�atoirement (gr�ce �
	 * la fonction Random().nextInt. La taille de la grille est fix�e par la constante TAILLEGRILLE.
	 */
	public Environnement()
	{
		super();
		int abs = new Random().nextInt(TAILLEGRILLE + 1);
		int ord = new Random().nextInt(TAILLEGRILLE + 1);
		this.positionPastille = new Coordonnees(abs, ord);
		this.grille = new int[TAILLEGRILLE][TAILLEGRILLE];
		int i = 0;
		int j;
		while (i < TAILLEGRILLE)
		{
			j = 0;
			if ((i == 0) || (i == TAILLEGRILLE - 1))
			{
				while (j < TAILLEGRILLE)
				{
					this.grille[i][j] = MUR;
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
						this.grille[i][j] = MUR;
					}
					else
					{
						if ((j != abs) && (i != ord))
							this.grille[i][j] = CASE_VIDE;
						else
							this.grille[i][j] = PASTILLE;
					}
					j++;
				}
			}
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
				// FIXME utiliser les constantes
				if (this.grille[i][j] == 0)
				{
					res = res + "-";
				}
				if (this.grille[i][j] == 8)
				{
					res = res + "#";
				}
				if (this.grille[i][j] == 2)
				{
					res = res + "P";
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
