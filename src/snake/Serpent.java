package snake;

// FIXME déplacer dans un paquetage (FIXED)

// FIXME corriger le commentaire (dire à quoi sert cette classe, pas comment elle est faite) (FIXED)
/**
 * Classe Serpent
 * Désigne le serpent qui représente le personnage principal du jeu.
 * @author berardk

 */
public class Serpent
{

	// FIXME simplifier le commentaire :"Longueur initiale (nombre d'éléments) par défaut du serpent"
	// FIXME générer la Javadoc et regarder à quoi elle ressemble
	/**
	 * Constante : Longueur initiale (nombre d'éléments) par défaut du serpent.
	 */
	// FIXME renommer la constante (longueur par défaut) (FIXED)
	public final static int LONGUEUR_INIT = 4;
	
	// FIXME supprimer cette constante, elles rendent Serpent dépendante de Environnement (FIXED)
	
	// FIXME supprimer cette constante, elles rendent Serpent dépendante de Environnement (FIXED)

	// FIXME corriger le commentaire (ce n'est pas qu'à l'état initial) (FIXED)
	/**
	 * Nombre d'éléments qui constituent le serpent
	 */
	private int longueur;
	
    /**
     * Position du serpent
     */
    private Coordonnees position; 
	
	/**
	 * Initialise le serpent avec une position donnée et une longueur par défaut.
	 * @param depart : coordonnées de départ de la tete du serpent
	 */
	public Serpent(Coordonnees depart)
	{
		super();
		this.longueur = LONGUEUR_INIT;
		this.position = depart;
	}
		
	/**
	 * Initialise le serpent avec une longueur et une position données.
	 * @param longueur : longueur initiale du corps du serpent
	 * @param depart : coordonnées de départ de la tete du serpent
	 */
	public Serpent(int longueur, Coordonnees depart)
	{
		super();
		this.longueur = longueur;
		this.position = depart;
	}
	

	
	// FIXME méthodes ?
}
