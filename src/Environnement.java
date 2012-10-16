import java.util.Arrays;

// FIXME d�placer dans un paquetage
/**
 * @author berardk
 * Classe Environnement (tableau d�finissant le terrain)
 * @param grille : tableau a deux dimensions (tailleGrille*tailleGrille)
 * @param abscissePastille : Abscisse de la pastille dans le plan.
 * @param ordonneePastille : Ordonn�e de la pastille dans le plan.
 */
public class Environnement
{
	/**
	 * D�signe l'abscisse de la pastille dans le terrain.
	 */
	private int abscissePastille;

	/**
	 * D�signe l'ordonn�e de la pastille dans le terrain.
	 */
	private int ordonneePastille;
	
	/**
	 * D�signe une valeur de la taille du terrain de jeu.
	 */
	// FIXME si c'est une constante, la d�clarer comme une constante. Sinon, initialisation dans le constructeur
	private final int tailleGrille = 20 ;
	
	
	// FIXME corriger le commentaire (ce n'est pas une taille)
	// FIXME initialisation dans le constructeur
	/**
	 * D�signe la taille du tableau qui sera le terrain de jeu.
	 * Une grille contient un serpent et une pastille.
	 */
	private int grille[][] = new int[tailleGrille][tailleGrille];

	
	// FIXME definir une constructeur
	
	
	@Override
	public String toString()
	{
		return "Environnement [tailleGrille=" + tailleGrille + ", grille=" + Arrays.toString(grille) + "]";
	}
	
	// FIXME autres m�thodes ? 
}
