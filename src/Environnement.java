import java.util.Arrays;
import java.util.Random;

// FIXME déplacer dans un paquetage

// FIXME corriger le commentaire (dire à quoi sert cette classe, pas comment elle est faite)
/**
 * Classe Environnement (tableau définissant le terrain)
 * grille : tableau a deux dimensions (tailleGrille*tailleGrille)
 * abscissePastille : Abscisse de la pastille dans le plan.
 * ordonneePastille : Ordonnée de la pastille dans le plan.
 * @author berardk

 */
public class Environnement
{	
	/**
	 * Désigne la position de la pastille
	 */
	private Coordonnees positionPastille;
	
	// FIXME déplacer les définitions des constantes avant celles des attributs
	/**
	 * Désigne une valeur de la taille du terrain de jeu.
	 */

	public final static int TAILLEGRILLE = 20 ;
	
	
	/**
	 * Désigne le tableau qui sera le terrain de jeu.
	 * Une grille contient un serpent et une pastille.
	 */
	private int[][] grille;

	
	/**
	 * Constructeur de l'environnement de jeu
	 * Initialise le terrain avec une pastille positionnée aléatoirement (grâce à la
	 * fonction Random().nextInt.
	 * La taille de la grille est fixée par la constante TAILLEGRILLE.
	 */
	public Environnement()
	{
		super();
		int abs = new Random().nextInt(TAILLEGRILLE + 1);
		int ord = new Random().nextInt(TAILLEGRILLE + 1);
		this.positionPastille = new Coordonnees(abs,ord);
		this.grille = new int[TAILLEGRILLE][TAILLEGRILLE];
	}
	
	
	// FIXME il faudrait modifier l'implémentation de toString pour qu'elle retourne une représentation en ascii-art de la grille
	@Override
	public String toString()
	{
		return "Environnement [TAILLEGRILLE=" + TAILLEGRILLE + ", grille=" + Arrays.toString(this.grille) + "]";
	}



	// FIXME autres méthodes ? 
}
