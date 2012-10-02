
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



	public int getAbscisse()
	{
		return abscisse;
	}



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
