// FIXME déplacer dans un paquetage


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

	/**
	 * Constante : Longueur initiale (nombre d'éléments) par défaut du serpent.
	 */
	public final static int LONGUEUR = 4;
	/**
	 * Constante : Abscisse initiale par défaut de la tête du serpent.
	 */
	public final static int ABS_INIT = Environnement.TAILLEGRILLE/2 ;
	/**
	 * Constante : Ordonnée initiale par défaut de la tête du serpent.
	 */
	public final static int ORD_INIT = Environnement.TAILLEGRILLE/2 ;

	
	/**
	 * Nombre d'éléments qui constituent le serpent à l'état initial.
	 */
	private int longueur;
	
    /**
     * Coordonnées qui indique la position du serpent
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
	

	
	// FIXME constructeurs, méthodes ?
}
