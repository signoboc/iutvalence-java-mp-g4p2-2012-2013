// FIXME déplacer dans un paquetage
/**
 * @author berardk
 * Classe : Coordonnées (couple abscisse/ordonnee)
 * 
 * @param abscisse : Abscisse d'un point dans le plan
 * @param ordonnee : Ordonnée d'un point dans le plan
 * 
 * Ces coordonnées seront utilisées pour les positions du serpent et de la pastille. 
 */
public class Coordonnees
{  
	/**
	 * Désigne l'abscisse d'un point dans le plan
	 */
	private final int abscisse;

	/**
	 * Désigne l'ordonnée d'un point dans le plan
	 */
	private final int ordonnee;
	
	/**
	 * Coordonnées d'un point dans le plan
	 * @param abscisse
	 * 				Abscisse d'un point dans le plan
	 * @param ordonnee
	 * 				Ordonnée d'un point dans le plan
	 */
	public Coordonnees(int abscisse, int ordonnee)
	{
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}


	/**
	 * Permet d'accéder à l'abscisse d'un point n'importe où dans l'application
	 * @return abscisse d'un point dans le plan
	 */
	public int getAbscisse()
	{
		return abscisse;
	}


	/**
	 * Permet d'accéder à l'ordonnée d'un point n'importe où dans l'application
	 * @return ordonnee d'un point dans le plan
	 */
	public int getOrdonnee()
	{
		return ordonnee;
	}



	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + abscisse;
		result = prime * result + ordonnee;
		return result;
	}


	/**
	 * Redéfinition de equals pour comparer des coordonnées.
	 * 		Deux coordonnées sont égales si les deux abscisses et les deux ordonnées
	 * 		sont égales.
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Coordonnees)) 
			return false;
		Coordonnees other = (Coordonnees) obj;
		if (this.abscisse != other.abscisse)
			return false;
		return (this.ordonnee == other.ordonnee);
	}


	@Override
	public String toString()
	{
		return "Coordonnees [abscisse=" + abscisse + ", ordonnee=" + ordonnee + "]";
	}
}
