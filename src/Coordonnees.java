// FIXME d�placer dans un paquetage


/**
 * @author berardk
 * Classe : Coordonn�es (couple abscisse/ordonnee)
 * 
 * abscisse : Abscisse d'un point dans le plan
 * ordonnee : Ordonn�e d'un point dans le plan
 * 
 * Ces coordonn�es seront utilis�es pour les positions du serpent et de la pastille. 
 */
public class Coordonnees
{  
	/**
	 * D�signe l'abscisse d'un point dans le plan
	 */
	private final int abscisse;

	/**
	 * D�signe l'ordonn�e d'un point dans le plan
	 */
	private final int ordonnee;
	
	
	// FIXME corriger le commentaire (indiquer dans quel �tat est l'objet cr��)
	/**
	 * Coordonn�es d'un point dans le plan
	 * @param abscisse
	 * 				Abscisse d'un point dans le plan
	 * @param ordonnee
	 * 				Ordonn�e d'un point dans le plan
	 */
	public Coordonnees(int abscisse, int ordonnee)
	{
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	// FIXME corriger le commentaire (on ne parle pas d'un point mais DU point) (FIXED)

	/**
	 * Permet d'acc�der � l'abscisse du point n'importe o� dans l'application
	 * @return abscisse du point
	 */
	public int getAbscisse()
	{
		return abscisse;
	}


	/**
	 * Permet d'acc�der � l'ordonn�e du point n'importe o� dans l'application
	 * @return ordonnee du point
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
	 * Red�finition de equals pour comparer des coordonn�es.
	 * 		Deux coordonn�es sont �gales si les deux abscisses et les deux ordonn�es
	 * 		sont �gales.
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
	
	// FIXME �crire une application de test basique pour cette classe
}
