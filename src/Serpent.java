// FIXME déplacer dans un paquetage

// FIXME corriger le commentaire (dire à quoi sert cette classe, pas comment elle est faite)
/**
 * Classe Serpent
 * 
 * longueur : Désigne le nombre d'élément qui constitue le serpent à l'état initial
 * absInit : Désigne l'abscisse initiale de la tête du serpent sur le terrain.
 * ordInit : Désigne l'ordonnée initiale de la tête du serpent sur le terrain.
 * @author berardk

 */
public class Serpent
{

	// FIXME simplifier le commentaire :"Longueur initiale (nombre d'éléments) par défaut du serpent"
	// FIXME générer la Javadoc et regarder à quoi elle ressemble
	/**
	 * Constante : Longueur initiale (nombre d'éléments) par défaut du serpent.
	 */
	// FIXME renommer la constante (longueur par défaut)
	public final static int LONGUEUR = 4;
	
	// FIXME supprimer cette constante, elles rendent Serpent dépendante de Environnement
	/**
	 * Constante : Abscisse initiale par défaut de la tête du serpent.
	 */
	public final static int ABS_INIT = Environnement.TAILLEGRILLE/2 ;
	
	// FIXME supprimer cette constante, elles rendent Serpent dépendante de Environnement
	/**
	 * Constante : Ordonnée initiale par défaut de la tête du serpent.
	 */
	public final static int ORD_INIT = Environnement.TAILLEGRILLE/2 ;

	// FIXME corriger le commentaire (ce n'est pas qu'à l'état initial)
	/**
	 * Nombre d'éléments qui constituent le serpent à l'état initial.
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
		this.longueur = LONGUEUR;
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
