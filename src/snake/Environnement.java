package snake;
import java.util.Arrays;
import java.util.Random;


// FIXME d�placer dans un paquetage (FIXED)

// FIXME corriger le commentaire (dire � quoi sert cette classe, pas comment elle est faite) (FIXED)
/**
 * Classe Environnement
 * Tableau d'entiers � deux dimensions repr�sentant le terrain de jeu, o� apparaitra
 * la pastille et le serpent. 
 * @author berardk

 */
public class Environnement
{	
	// FIXME d�placer les d�finitions des constantes avant celles des attributs (FIXED)
	/**
	 * D�signe une valeur de la taille du terrain de jeu.
	 */
	public final static int TAILLEGRILLE = 20 ;
	/**
	 * Constante : Symbolise une case vide sur le terrain.
	 */
	public final static int CASE_VIDE = 0 ;
	/**
	 * Constante : Symbolise un mur sur le terrain.
	 */
	public final static int MUR = 8 ;
	/**
	 * Constante : Symbolise la pastille sur le terrain.
	 */
	public final static int PASTILLE = 2 ;
	/**
	 * Constante : Symbolise la t�te du serpent sur le terrain.
	 */
	public final static int TETE = 5 ;
	/**
	 * Constante : Symbolise le corps du serpent sur le terrain.
	 */
	public final static int CORPS = 6 ;
	
	
	/**
	 * D�signe la position de la pastille
	 */
	private Coordonnees positionPastille;
	
	
	/**
	 * D�signe le tableau qui sera le terrain de jeu.
	 * Une grille contient un serpent et une pastille.
	 */
	private int[][] grille;

	
	/**
	 * Constructeur de l'environnement de jeu
	 * Initialise le terrain avec une pastille positionn�e al�atoirement (gr�ce � la
	 * fonction Random().nextInt.
	 * La taille de la grille est fix�e par la constante TAILLEGRILLE.
	 */
	public Environnement()
	{
		super();
		int abs = new Random().nextInt(TAILLEGRILLE + 1);
		int ord = new Random().nextInt(TAILLEGRILLE + 1);
		this.positionPastille = new Coordonnees(abs,ord);
		this.grille = new int[TAILLEGRILLE][TAILLEGRILLE];
		int i = 0 ;
		int j = 0 ;
		while (i < TAILLEGRILLE)
		{
			if ((i == 0)||(i == TAILLEGRILLE - 1))
			{
				while (j < TAILLEGRILLE)
				{
					this.grille[i][j]= MUR ;
					j++;
				}
				j = 0;
			}
			else
			{
				while (j < TAILLEGRILLE)
				{
					if ((j == 0)||(j == TAILLEGRILLE -1))
					{
						this.grille[i][j] = MUR;
					}
					else
					{
						if ((j != abs) && (i != ord))
							this.grille[i][j]= CASE_VIDE;
						else
							this.grille[i][j]= PASTILLE;
					}
					j++;
				}
			}
			i++;
		}
			
	}
	
	
	// FIXME il faudrait modifier l'impl�mentation de toString pour qu'elle retourne une repr�sentation en ascii-art de la grille
	@Override
	public String toString()
	{
		String res = "";
		int i = 0 ;
		int j = 0 ;
		while (i < TAILLEGRILLE)
		{
			while (j < TAILLEGRILLE)
			{
				if ((j != abs) && (i != ord))
					
				else
					
				res = res + "0";
				j++;
			}
			i++;
		}
		
		
		return res;
	}



	// FIXME autres m�thodes ? 
}
