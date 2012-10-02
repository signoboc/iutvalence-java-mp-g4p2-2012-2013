// FIXME déplacer dans un paquetage
// FIXME corriger le commentaire
/**
 * @author berardk
 * L'environnement du jeu
 */
public class Environnement
{
	// FIXME respecter les conventions d'écriture
	// FIXME écrire un commentaire
	private int abscisse_pastille;

	// FIXME respecter les conventions d'écriture
	// FIXME écrire un commentaire
	private int ordonnee_pastille;
	
	// FIXME respecter la syntaxe Javadoc
	// FIXME préciser quel peut être le contenu des cases du tableau, définir des constantes
	private int[][] grille;					// Taille du tableau (Carte du jeu)
	
	
	// FIXME corriger le commentaire
	// FIXME vérifier que taille est réaliste (définir des constantes pour les bornes min/max, soulever une exception en cas de non respect des bornes	
	/**
	 * @param taille
	 * Initialise la taille du terrain de jeu (un carré de côté taille)
	 */
	public Environnement(int taille)
	{
		super();
		this.grille = new int[taille][taille];
		
		// FIXME tous les attributs doivent être initialisés (c'est mieux)
	}

	
	// FIXME redéfinir la méthode toString pour avoir une représentation en ASCII-art de la grille

	// FIXME autres méthodes ? 
}
