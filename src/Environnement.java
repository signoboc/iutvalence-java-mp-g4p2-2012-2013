// FIXME d�placer dans un paquetage
// FIXME corriger le commentaire
/**
 * @author berardk
 * L'environnement du jeu
 */
public class Environnement
{
	// FIXME respecter les conventions d'�criture
	// FIXME �crire un commentaire
	private int abscisse_pastille;

	// FIXME respecter les conventions d'�criture
	// FIXME �crire un commentaire
	private int ordonnee_pastille;
	
	// FIXME respecter la syntaxe Javadoc
	// FIXME pr�ciser quel peut �tre le contenu des cases du tableau, d�finir des constantes
	private int[][] grille;					// Taille du tableau (Carte du jeu)
	
	
	// FIXME corriger le commentaire
	// FIXME v�rifier que taille est r�aliste (d�finir des constantes pour les bornes min/max, soulever une exception en cas de non respect des bornes	
	/**
	 * @param taille
	 * Initialise la taille du terrain de jeu (un carr� de c�t� taille)
	 */
	public Environnement(int taille)
	{
		super();
		this.grille = new int[taille][taille];
		
		// FIXME tous les attributs doivent �tre initialis�s (c'est mieux)
	}

	
	// FIXME red�finir la m�thode toString pour avoir une repr�sentation en ASCII-art de la grille

	// FIXME autres m�thodes ? 
}
