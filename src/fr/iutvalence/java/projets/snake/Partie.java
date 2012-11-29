package fr.iutvalence.java.projets.snake;

import java.util.Random;

/**
 * Classe : Partie Classe principale de l'application : G�re la gestion des autres classes, g�n�re la partie de jeu.
 * 
 * @author berardk
 */
public class Partie
{
	/**
	 * D�signe la position de la pastille.
	 */
	private Coordonnees positionPastille;
	
	/**
	 * D�signe le nom du joueur.
	 */
	private String nomJoueur;
	
	/**
	 * D�signe le serpent de la partie.
	 */
	private Serpent snake;
	
	/**
	 * D�signe le terrain de jeu.
	 */
	private Environnement map;

	/**
	 * D�signe le score du joueur.
	 */
	private int scoreJoueur;
	
	/**
	 * Message affich� en fin de partie.
	 */
	private static String gameOver = "GAME OVER !\n";
	
	/**
	 * Constructeur de la partie.
	 */	
	public Partie()
	{
		super();
		// Initialisation de la partie : On met un serpent sur une map.
		this.map = new Environnement();
		this.snake = new Serpent();
		placerSerpent(this.snake, this.map);
		
		//Gestion et placement de la pastille :
		Coordonnees pastille = genererNouvellePastille();
		placerPastille(pastille, this.map);
		
	}
	
	
	/**
	 * @param pastille : pastille que l'on veut placer sur la map.
	 * @param map : map dans laquelle on veut placer la pastille.
	 * @return : La map avec la pastille.
	 */
	private void placerPastille(Coordonnees pastille, Environnement map)
	{
		try
		{
			map.setCaseAt(pastille, Case.PASTILLE);
		}
		catch (CoordonneesInvalideException e)
		{
			// Nothing!
		}
	}
	
	/**
	 * M�thode qui permet de placer le serpent sur le terrain � l'aide de son tableau de positions.
	 * @param snake : serpent � placer sur la map
	 * @param map : map sur laquelle on veut placer le serpent
	 * @return : La map avec le serpent.
	 */
	private void placerSerpent(Serpent snake, Environnement map) 
	{
		int i = 1;
		int longueur = snake.getLongueur();
		Coordonnees[] position = snake.getPosition();
		try
		{
			map.setCaseAt(position[0], Case.TETE);
		}
		catch (CoordonneesInvalideException e)
		{
			// ca n'arrive pas !
		}
		while (i < longueur )
		{
			try
			{
				map.setCaseAt(position[i], Case.CORPS);
			}
			catch (CoordonneesInvalideException e)
			{
				// doesn't happen
			}
			i++;
		}
	}
	
	/**
	 * M�thode pour g�n�rer une pastille aux coordonn�es al�atoires.
	 * @return : Couple de coordonn�es de la nouvelle pastille.
	 */
	private Coordonnees genererNouvellePastille()
	{
		int abs = (new Random().nextInt(Environnement.TAILLEGRILLE - 2)) + 1;
		int ord = (new Random().nextInt(Environnement.TAILLEGRILLE - 2)) + 1;
		this.positionPastille = new Coordonnees(abs, ord);
		return this.positionPastille;
	}


	/**
	 * M�thode qui g�re le d�roulement de la partie.
	 * @throws InterruptedException : G�re l'exception li�e au sleep.
	 */
	public void demarrer() throws InterruptedException
	{
		Case contenu = Case.VIDE;
		//this.snake = new Serpent();
		//this.map = new Environnement();
		while(true)
		{
			Thread.sleep(500);
			this.snake.DeplacerSerpent();
			Coordonnees[] positionSerpent = this.snake.getPosition();
			try
			{
				contenu = this.map.getCaseAt(positionSerpent[0]);
			}
			catch (CoordonneesInvalideException e)
			{
				// Nothing !
			}
			
			// Comparaison de coordonn�es de la t�te et des murs:
			if (contenu == Case.MUR)
			{
				System.out.print(gameOver);
				break;
			}

			if (contenu == Case.PASTILLE)
			{
				//Incr�mentation de la longueur du serpent.
				int longSerp = this.snake.getLongueur();
				longSerp++;
				this.snake.setLongueur(longSerp);
				
				//Rajouter un �l�ment au tableau de position du serpent.
				
				
				//G�n�rer une nouvelle pastille (dans la variable pastille).
			}
			this.placerSerpent(this.snake, this.map);
			System.out.println(this.map);
			
		}
		
	}
	
	// FIXME (autres) attributs, constructeurs, m�thodes ?
}
