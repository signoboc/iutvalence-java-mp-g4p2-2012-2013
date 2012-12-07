package fr.iutvalence.java.projets.snake;

import java.util.Random;
import java.awt.*;
import java.awt.event.*;

/**
 * Classe : Partie Classe principale de l'application : Gère la gestion des autres classes, génère la partie de jeu.
 * 
 * @author berardk
 */
public class Partie implements Controle
{
	/**
	 * Désigne la position de la pastille.
	 */
	private Coordonnees positionPastille;
	
	/**
	 * Interface d'affichage.
	 */
	private Aff a;
	
	/**
	 * Interface de gestion des touches.
	 */
	//private Controle c;
	
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
	 * @param a : Interface d'affichage.
	 */	
	public Partie(Aff a)
	{
		super();
		
		// Initialisation de la partie : On met un serpent sur une map.
		this.map = new Environnement();
		this.snake = new Serpent(10);
		this.scoreJoueur = 0;
		this.nomJoueur = "Joueur";
		this.a = a;
		//this.c = c;
		placerSerpent(this.snake, this.map);
		
		//Gestion et placement de la pastille :
		Coordonnees pastille = genererNouvellePastille();
		placerPastille(pastille, this.map);
		
	}
	
	public int getScoreJoueur()
	{
		return scoreJoueur;
	}


	public void setScoreJoueur(int scoreJoueur)
	{
		this.scoreJoueur = scoreJoueur;
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
	
	
	// GESTION DU CLAVIER
	/**
	 * Méthode qui va gérer les évenements du clavier
	 * @param e : Evenement, touche appuyée.
	 */
	public void orienterSerpent ( Direction dir)
	{
	    	// touche flèche droite
	    if ((this.snake.getDirection() == Direction.HAUT) || (this.snake.getDirection() == Direction.BAS))
	    	this.snake.OrienterDroite();
	    else if ((this.snake.getDirection() == Direction.HAUT) || (this.snake.getDirection() == Direction.BAS))
	    	this.snake.OrienterGauche();
	    else if ((this.snake.getDirection() == Direction.GAUCHE) || (this.snake.getDirection() == Direction.DROITE))
	    	this.snake.OrienterHaut();
	    else if ((this.snake.getDirection() == Direction.GAUCHE) || (this.snake.getDirection() == Direction.DROITE))
	    	this.snake.OrienterBas();
	}


	/**
	 * Méthode qui gère le déroulement de la partie.
	 * @throws InterruptedException : Gère l'exception liée au sleep.
	 */
	public void demarrer() throws InterruptedException
	{
		Case contenu = Case.VIDE;
		Coordonnees pastille;
		int score = 0;
		
		// Positions du serpent avant et après déplacement
		Coordonnees[] positionSerpent;
		Coordonnees[] positionSerpentpre;
		
		// Abscisse et ordonnées utilisées pour l'allongement du serpent.
		int absqueue, ordqueue;
		
		int longueurSerpent = 0;
		int longueurSerpentpre = 0;
		int i;
		while(true)
		{
			Thread.sleep(200);
			
			// On sauvegarde des éléments de l'ancien serpent qui serviront à l'allongement
			// du serpent et à la réinitialisation du terrain:
			positionSerpentpre = this.snake.getPosition();
			longueurSerpent = this.snake.getLongueur();
			longueurSerpentpre = this.snake.getLongueur();
			absqueue = positionSerpentpre[longueurSerpent - 1].getAbscisse();
			ordqueue = positionSerpentpre[longueurSerpent - 1].getOrdonnee();
			
			// Réinitialisation du tableau : On efface le serpent précédent.			
						i=0;
						while (i < longueurSerpentpre)
						{
							try
							{
								this.map.setCaseAt(positionSerpentpre[i], Case.VIDE);
							}
							catch (CoordonneesInvalideException e)
							{
								// Nothing !
							}
							i++;
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
			i=1;
			while ( i < longueurSerpent )
			{
				if (positionSerpent[0] == positionSerpentpre[i])
				{
					System.out.print(gameOver);
					break;
				}
				i++;
			}
			
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
				
				//Incrémentation du score
				score = getScoreJoueur();
				score++;
				this.setScoreJoueur(score);
				
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
			this.a.afficheMap(this.map);
			this.a.afficheJoueurEtScore(this.nomJoueur, this.scoreJoueur);
		}
		
	}

	
	// FIXME (autres) attributs, constructeurs, méthodes ?
}