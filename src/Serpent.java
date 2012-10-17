// FIXME d�placer dans un paquetage

// FIXME corriger le commentaire (dire � quoi sert cette classe, pas comment elle est faite)
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

	// FIXME simplifier le commentaire :"Longueur initiale (nombre d'�l�ments) par d�faut du serpent"
	// FIXME g�n�rer la Javadoc et regarder � quoi elle ressemble
	/**
	 * Constante : Longueur initiale (nombre d'�l�ments) par d�faut du serpent.
	 */
	// FIXME renommer la constante (longueur par d�faut)
	public final static int LONGUEUR = 4;
	
	// FIXME supprimer cette constante, elles rendent Serpent d�pendante de Environnement
	/**
	 * Constante : Abscisse initiale par d�faut de la t�te du serpent.
	 */
	public final static int ABS_INIT = Environnement.TAILLEGRILLE/2 ;
	
	// FIXME supprimer cette constante, elles rendent Serpent d�pendante de Environnement
	/**
	 * Constante : Ordonn�e initiale par d�faut de la t�te du serpent.
	 */
	public final static int ORD_INIT = Environnement.TAILLEGRILLE/2 ;

	// FIXME corriger le commentaire (ce n'est pas qu'� l'�tat initial)
	/**
	 * Nombre d'�l�ments qui constituent le serpent � l'�tat initial.
	 */
	private int longueur;
	
    /**
     * Position du serpent
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
	

	
	// FIXME m�thodes ?
}
