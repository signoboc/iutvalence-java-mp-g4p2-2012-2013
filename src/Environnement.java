import java.util.Arrays;
import java.util.Random;

// FIXME d�placer dans un paquetage

// FIXME corriger le commentaire (dire � quoi sert cette classe, pas comment elle est faite)
/**
 * Classe Environnement (tableau d�finissant le terrain)
 * grille : tableau a deux dimensions (tailleGrille*tailleGrille)
 * abscissePastille : Abscisse de la pastille dans le plan.
 * ordonneePastille : Ordonn�e de la pastille dans le plan.
 * @author berardk

 */
public class Environnement
{	
	/**
	 * D�signe la position de la pastille
	 */
	private Coordonnees positionPastille;
	
	// FIXME d�placer les d�finitions des constantes avant celles des attributs
	/**
	 * D�signe une valeur de la taille du terrain de jeu.
	 */

	public final static int TAILLEGRILLE = 20 ;
	
	
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
	}
	
	
	// FIXME il faudrait modifier l'impl�mentation de toString pour qu'elle retourne une repr�sentation en ascii-art de la grille
	@Override
	public String toString()
	{
		return "Environnement [TAILLEGRILLE=" + TAILLEGRILLE + ", grille=" + Arrays.toString(this.grille) + "]";
	}



	// FIXME autres m�thodes ? 
}
