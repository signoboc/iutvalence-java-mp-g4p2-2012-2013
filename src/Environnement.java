import java.util.Arrays;
import java.util.Random;

// FIXME d�placer dans un paquetage
/**
 * @author berardk
 * Classe Environnement (tableau d�finissant le terrain)
 * grille : tableau a deux dimensions (tailleGrille*tailleGrille)
 * abscissePastille : Abscisse de la pastille dans le plan.
 * ordonneePastille : Ordonn�e de la pastille dans le plan.
 */
public class Environnement
{	
	/**
	 * D�signe la position de la pastille
	 */
	private Coordonnees positionPastille;
	
	
	/**
	 * D�signe une valeur de la taille du terrain de jeu.
	 */

	public final static int TAILLEGRILLE = 20 ;
	
	
	// FIXME corriger le commentaire (ce n'est pas une taille) (FIXED)
	// FIXME initialisation dans le constructeur (FIXED)
	/**
	 * D�signe le tableau qui sera le terrain de jeu.
	 * Une grille contient un serpent et une pastille.
	 */
	private int grille[][];

	
	// FIXME definir un constructeur (FIXED)
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
	
	
	
	@Override
	public String toString()
	{
		return "Environnement [TAILLEGRILLE=" + TAILLEGRILLE + ", grille=" + Arrays.toString(this.grille) + "]";
	}



	// FIXME autres m�thodes ? 
}
