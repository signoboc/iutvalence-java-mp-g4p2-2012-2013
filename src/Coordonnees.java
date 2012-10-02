// FIXME déplacer dans un paquetage
// FIXME corriger le commentaire
/**
 * @author berardk
 * Coordonnées qui seront utilisées pour les positions du serpent et de la pastille. 
 */
public class Coordonnees
{	
	// FIXME écrire un commentaire  
	private final int abscisse;

	// FIXME écrire un commentaire
	private final int ordonnee;
	
	// FIXME écrire un commentaire
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
	 * Retourne l'ordonnée de l'objet
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

	
	// FIXME redéfinir equals et hashCode
}
