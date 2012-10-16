// FIXME d�placer dans un paquetage


/**
 * Classe Serpent
 * 
 * longueur : D�signe le nombre d'�l�ment qui constitue le serpent � l'�tat initial
 * absInit : D�signe l'abscisse initiale de la t�te du serpent sur le terrain.
 * ordInit : D�signe l'ordonn�e initiale de la t�te du serpent sur le terrain.
 * @author berardk

 */
public class Serpent
{

	/**
	 * Constante : Longueur initiale (nombre d'�l�ments) par d�faut du serpent.
	 */
	public final static int LONGUEUR = 4;
	/**
	 * Constante : Abscisse initiale par d�faut de la t�te du serpent.
	 */
	public final static int ABS_INIT = Environnement.TAILLEGRILLE/2 ;
	/**
	 * Constante : Ordonn�e initiale par d�faut de la t�te du serpent.
	 */
	public final static int ORD_INIT = Environnement.TAILLEGRILLE/2 ;

	
	/**
	 * Nombre d'�l�ments qui constituent le serpent � l'�tat initial.
	 */
	private int longueur;
	
    /**
     * Coordonn�es qui indique la position du serpent
     */
    private Coordonnees position; 
	
	/**
	 * Initialise le serpent avec une position donn�e et une longueur par d�faut.
	 * @param depart : coordonn�es de d�part de la tete du serpent
	 */
	public Serpent(Coordonnees depart)
	{
		super();
		this.longueur = LONGUEUR;
		this.position = depart;
	}
		
	/**
	 * Initialise le serpent avec une longueur et une position donn�es.
	 * @param longueur : longueur initiale du corps du serpent
	 * @param depart : coordonn�es de d�part de la tete du serpent
	 */
	public Serpent(int longueur, Coordonnees depart)
	{
		super();
		this.longueur = longueur;
		this.position = depart;
	}
	

	
	// FIXME constructeurs, m�thodes ?
}
