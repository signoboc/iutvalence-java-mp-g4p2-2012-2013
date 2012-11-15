package fr.iutvalence.java.projets.snake;


/**
 * Coordonn�es (couple abscisse/ordonnee)
 * 
 * 
 * @author berardk
 * 
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
	 * 
	 * @param abscisse
	 *            Abscisse d'un point dans le plan
	 * @param ordonnee
	 *            Ordonn�e d'un point dans le plan
	 */
	public Coordonnees(int abscisse, int ordonnee)
	{
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	/**
	 * Obtenir l'abscisse du point
	 * 
	 * @return abscisse du point
	 */
	public int getAbscisse()
	{
		return this.abscisse;
	}

	/**
	 * Permet d'acc�der � l'ordonn�e du point n'importe o� dans l'application
	 * 
	 * @return ordonnee du point
	 */
	public int getOrdonnee()
	{
		return this.ordonnee;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.abscisse;
		result = prime * result + this.ordonnee;
		return result;
	}

	/**
	 * Red�finition de equals pour comparer des coordonn�es. Deux coordonn�es sont �gales si les deux abscisses et les
	 * deux ordonn�es sont �gales.
	 * 
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
		return "Coordonnees [abscisse=" + this.abscisse + ", ordonnee=" + this.ordonnee + "]";
	}

	// FIXME �crire une application de test basique pour cette classe (dans une autre classe)
}
