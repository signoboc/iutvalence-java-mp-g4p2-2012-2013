
/**
 * @author berardk
 * L'environnement du jeu
 */
public class Environnement
{
	private int abscisse_pastille;
	private int ordonnee_pastille;
	private int[][] grille;					// Taille du tableau (Carte du jeu)
	
	/**
	 * @param taille
	 * Initialise la taille du terrain de jeu (un carré de côté taille)
	 */
	public Environnement(int taille)
	{
		super();
		this.grille = new int[taille][taille];
	}
	
}
