// FIXME d�placer dans un paquetage
// FIXME corriger le commentaire
/**
 * @author berardk
 * Coordonn�es qui seront utilis�es pour les positions du serpent et de la pastille. 
 */
public class Coordonnees
{	
	// FIXME �crire un commentaire  
	private final int abscisse;

	// FIXME �crire un commentaire
	private final int ordonnee;
	
	// FIXME �crire un commentaire
	public Coordonnees(int abscisse, int ordonnee)
	{
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}


	// FIXME corriger le commentaire
	/**
	 * @return
	 * Retourne l'abscisse de l'objet
	 */
	public int getAbscisse()
	{
		return abscisse;
	}

	// FIXME corriger le commentaire
	/**
	 * @return
	 * Retourne l'ordonn�e de l'objet
	 */
	public int getOrdonnee()
	{
		return ordonnee;
	}



	@Override
	public String toString()
	{
		return "Coordonnees [abscisse=" + abscisse + ", ordonnee=" + ordonnee + "]";
	}

	
	// FIXME red�finir equals et hashCode
}
