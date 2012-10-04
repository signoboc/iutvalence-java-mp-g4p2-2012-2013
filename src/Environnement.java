import java.util.Arrays;

// FIXME déplacer dans un paquetage
/**
 * @author berardk
 * Classe Environnement (tableau définissant le terrain)
 * @param grille : tableau a deux dimensions (tailleGrille*tailleGrille)
 * @param abscissePastille : Abscisse de la pastille dans le plan.
 * @param ordonneePastille : Ordonnée de la pastille dans le plan.
 */
public class Environnement
{
	/**
	 * Désigne l'abscisse de la pastille dans le terrain.
	 */
	private int abscissePastille;

	/**
	 * Désigne l'ordonnée de la pastille dans le terrain.
	 */
	private int ordonneePastille;
	
	/**
	 * Désigne une valeur de la taille du terrain de jeu.
	 */
	private final int tailleGrille = 20 ;
	
	/**
	 * Désigne la taille du tableau qui sera le terrain de jeu.
	 * Une grille contient un serpent et une pastille.
	 */
	private int grille[][] = new int[tailleGrille][tailleGrille];

	@Override
	public String toString()
	{
		return "Environnement [tailleGrille=" + tailleGrille + ", grille=" + Arrays.toString(grille) + "]";
	}
	
	// FIXME autres méthodes ? 
}
