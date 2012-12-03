package fr.iutvalence.java.projets.snake;

import java.util.Random;
import java.awt.*;
import java.awt.event.*;

/**
 * Classe : Partie Classe principale de l'application : Gère la gestion des autres classes, génère la partie de jeu.
 * 
 * @author berardk
 */
public class Partie
{
	/**
	 * Désigne la position de la pastille.
	 */
	private Coordonnees positionPastille;
	
	/**
	 * Désigne le nom du joueur.
	 */
	private String nomJoueur;
	
	/**
	 * Désigne le serpent de la partie.
	 */
	private Serpent snake;
	
	/**
	 * Désigne le terrain de jeu.
	 */
	private Environnement map;

	/**
	 * Désigne le score du joueur.
	 */
	private int scoreJoueur;
	
	/**
	 * Message affiché en fin de partie.
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
		this.snake = new Serpent(6);
		placerSerpent(this.snake, this.map);
		
		//Gestion et placement de la pastille :
		Coordonnees pastille = genererNouvellePastille();
		placerPastille(pastille, this.map);
		
	}
	
	
	/**
	 * @param pastille : pastille que l'on veut placer sur la map.
	 * @param map : map dans laquelle on veut placer la pastille.
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
	 * Méthode qui permet de placer le serpent sur le terrain à l'aide de son tableau de positions.
	 * @param snake : serpent à placer sur la map
	 * @param map : map sur laquelle on veut placer le serpent
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
	 * Méthode pour générer une pastille aux coordonnées aléatoires.
	 * @return : Couple de coordonnées de la nouvelle pastille.
	 */
	private Coordonnees genererNouvellePastille()
	{
		int abs = (new Random().nextInt(Environnement.TAILLEGRILLE - 2)) + 1;
		int ord = (new Random().nextInt(Environnement.TAILLEGRILLE - 2)) + 1;
		this.positionPastille = new Coordonnees(abs, ord);
		return this.positionPastille;
	}
	
	//GESTION DU CLAVIER
	
    /**
     * Méthode qui va gérer les évenements du clavier
     * @param event : Evenement : touche appuyée.
     */
    public void orienterSerpent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_RIGHT)
        {
        	// touche flèche droite
        	if ((this.snake.getDirection() == Direction.HAUT) || (this.snake.getDirection() == Direction.BAS))
        		this.snake.OrienterDroite();
        }
        else if (event.getKeyCode() == KeyEvent.VK_LEFT)
        {
        	// touche flèche gauche
        	if ((this.snake.getDirection() == Direction.HAUT) || (this.snake.getDirection() == Direction.BAS))
        		this.snake.OrienterGauche();
        }
        else if (event.getKeyCode() == KeyEvent.VK_UP)
        {
        	// touche flèche haut
        	if ((this.snake.getDirection() == Direction.GAUCHE) || (this.snake.getDirection() == Direction.DROITE))
        		this.snake.OrienterHaut();
        }
        else if (event.getKeyCode() == KeyEvent.VK_DOWN)
        {
        	// touche flèche bas
        	if ((this.snake.getDirection() == Direction.GAUCHE) || (this.snake.getDirection() == Direction.DROITE))
        		this.snake.OrienterBas();
        }
  }


	/**
	 * Méthode qui gère le déroulement de la partie.
	 * @throws InterruptedException : Gère l'exception liée au sleep.
	 */
	public void demarrer() throws InterruptedException
	{
		Case contenu = Case.VIDE;
		
		Coordonnees pastille;
		
		// Positions du serpent avant et après déplacement
		Coordonnees[] positionSerpent;
		Coordonnees[] positionSerpentpre;
		
		// Abscisse et ordonnées utilisées pour l'allongement du serpent.
		int absqueue, ordqueue;
		
		int longueurSerpent = 0;
		int i,j;
		while(true)
		{
			Thread.sleep(200);
			
			// On sauvegarde des éléments de l'ancien serpent qui serviront à l'allongement
			// du serpent et à la réinitialisation du terrain:
			positionSerpentpre = this.snake.getPosition();
			longueurSerpent = this.snake.getLongueur();
			absqueue = positionSerpentpre[longueurSerpent - 1].getAbscisse();
			ordqueue = positionSerpentpre[longueurSerpent - 1].getOrdonnee();
			// Réinitialisation du tableau : On efface le serpent précédent.			
			j=0;
			while (j < longueurSerpent)
			{
				try
				{
					this.map.setCaseAt(positionSerpentpre[j], Case.VIDE);
				}
				catch (CoordonneesInvalideException e)
				{
					// Nothing !
				}
				j++;
			}
			
			// Après initialisation, on déplace le serpent.
			this.snake.orientationAlea();
			this.snake.DeplacerSerpent();
			positionSerpent = this.snake.getPosition();
			try
			{
				contenu = this.map.getCaseAt(positionSerpent[0]);
			}
			catch (CoordonneesInvalideException e)
			{
				// Nothing !
			}
			
			//------------- GESTION DES COLLISIONS --------------//
			
			// Comparaison de coordonnées de la tête et des murs:
			if (contenu == Case.MUR)
			{
				System.out.print(gameOver);
				break;
			}
			
			// Comparaison de coordonnées de la tête et du corps:
		/**	i=2;
			while ( i < longueurSerpent + 1)
			{
				if (!(positionSerpent.equals(positionSerpentpre[i])))
				{
					System.out.print(gameOver);
					break;
				}
				i++;
			}
		**/	
			// Comparaison de coordonnées de la tête et de la pastille:
			if (contenu == Case.PASTILLE)
			{
				//Incrémentation de la longueur du serpent.
				longueurSerpent++;
				this.snake.setLongueur(longueurSerpent);
				
				//Rajouter un élément au tableau de position du serpent.
				
				positionSerpent[longueurSerpent - 1] = new Coordonnees(absqueue,ordqueue);
				
				this.snake.setPosition(positionSerpent);
				
				//Générer une nouvelle pastille (dans la variable pastille).
				pastille = genererNouvellePastille();
				
				//MAJ map avec la nouvelle pastille.
				this.placerPastille(pastille, this.map);
			}
						
			// Placement du serpent dans la map après déplacement :
			longueurSerpent = this.snake.getLongueur();
			positionSerpent = this.snake.getPosition();
			i = 1;
			
			try
			{
				this.map.setCaseAt(positionSerpent[0], Case.TETE);
			}
			catch (CoordonneesInvalideException e)
			{
				// Nothing !
			}
			
			while (i < longueurSerpent)
			{
				try
				{
					this.map.setCaseAt(positionSerpent[i], Case.CORPS);
				}
				catch (CoordonneesInvalideException e)
				{
					// Nothing !
				}
				i++;
			}
			//System.out.println(this.snake);
			System.out.println(this.map);
			
		}
		
	}
	
	// FIXME (autres) attributs, constructeurs, méthodes ?
}