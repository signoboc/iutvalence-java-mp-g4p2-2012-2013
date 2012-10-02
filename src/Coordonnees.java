
/**
 * @author berardk
 * Coordonn�es qui seront utilis�es pour les positions du serpent et de la pastille. 
 */
public class Coordonnees
{
	private final int abscisse;
	private final int ordonnee;
	

	public Coordonnees(int abscisse, int ordonnee)
	{
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}



	/**
	 * @return
	 * Retourne l'abscisse de l'objet
	 */
	public int getAbscisse()
	{
		return abscisse;
	}



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

}
